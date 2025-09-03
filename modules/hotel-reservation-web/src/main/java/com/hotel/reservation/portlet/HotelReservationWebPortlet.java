package com.hotel.reservation.portlet;

import com.hotel.reservation.constants.HotelReservationWebPortletKeys;


import com.hotel.reservation.exception.InvalidReservationDatesException;
import com.hotel.reservation.exception.RoomUnavailableException;
import com.hotel.reservation.model.Reservation;
import com.hotel.reservation.model.Room;
import com.hotel.reservation.service.ReservationLocalService;
import com.hotel.reservation.service.RoomLocalService;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author sea
 */
@Component(
        service = Portlet.class,
        property = {
                "com.liferay.portlet.display-category=category.hotel",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.name=" + HotelReservationWebPortletKeys.HOTELRESERVATIONWEB,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        }
)

public class HotelReservationWebPortlet extends MVCPortlet {

    @ProcessAction(name = "addRoom")
    public void addRoom(ActionRequest request, ActionResponse response) {
        // ServiceContext carrega informações úteis sobre a requisição (quem, onde, etc.)
        try {
            ServiceContext serviceContext = ServiceContextFactory.getInstance(request);
            ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

            // 1. Pega os dados simples do formulário
            String roomName = ParamUtil.getString(request, "roomName");
            String roomDescription = ParamUtil.getString(request, "roomDescription");
            int maxGuests = ParamUtil.getInteger(request, "maxGuests");
            String amenities = ParamUtil.getString(request, "amenities");
            double dailyRate = ParamUtil.getDouble(request, "dailyRate");
            long imageFileEntryId = 0;

            // 2. Lógica para tratar o upload do arquivo
            UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
            File imageFile = uploadRequest.getFile("roomImage");
            String imageMimeType = uploadRequest.getContentType("roomImage");

            if (imageFile != null && imageFile.length() > 0) {
                // Usa o serviço de Documentos e Mídia do Liferay para salvar o arquivo
                FileEntry fileEntry = _dlAppService.addFileEntry(
                        themeDisplay.getScopeGroupId(),
                        DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
                        imageFile.getName(),
                        imageMimeType,
                        imageFile.getName(),
                        "Imagem do quarto " + roomName,
                        "",
                        imageFile,
                        serviceContext
                );
                imageFileEntryId = fileEntry.getFileEntryId();
            }

            // 3. Chama o seu backend para salvar o quarto!
            _roomLocalService.addRoom(
                    themeDisplay.getUserId(),
                    roomName,
                    roomDescription,
                    imageFileEntryId, // Passa o ID da imagem salva
                    maxGuests,
                    new BigDecimal(dailyRate),
                    amenities,
                    true, // Status do quarto (ativo)
                    serviceContext
            );

        } catch (Exception e) {
            System.err.println("Erro ao adicionar quarto: " + e.getMessage());
            // Em um projeto real, você usaria SessionErrors.add(...) aqui
        }
    }

    @Override
    public void render(RenderRequest request, RenderResponse response)
            throws java.io.IOException, javax.portlet.PortletException {

        // Busca a lista de quartos do backend
        List<Room> rooms = _roomLocalService.getRooms(-1, -1);
        // Busca a lista de reservas do backend
        List<Reservation> reservations = _reservationLocalService.getReservations(-1, -1);

        // "Empurra" as listas para o request, para que os JSPs possam acessá-las
        request.setAttribute("rooms", rooms);
        request.setAttribute("reservations", reservations);

        super.render(request, response);
    }

    @ProcessAction(name = "addReservation")
    public void addReservation(ActionRequest request, ActionResponse response) {
        try {
            ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

            long roomId = ParamUtil.getLong(request, "roomId");
            String guestName = ParamUtil.getString(request, "guestName");
            String guestEmail = ParamUtil.getString(request, "guestEmail");
            // O Liferay usa um formato específico para datas, precisamos de um SimpleDateFormat para converter
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
            Date checkInDate = ParamUtil.getDate(request, "checkInDate", sdf);
            Date checkOutDate = ParamUtil.getDate(request, "checkOutDate", sdf);

            // Chamamos nosso backend, que contém toda a lógica de validação e cálculo
            _reservationLocalService.addReservation(
                    themeDisplay.getScopeGroupId(),
                    themeDisplay.getCompanyId(),
                    themeDisplay.getUserId(),
                    roomId,
                    guestName,
                    guestEmail,
                    checkInDate,
                    checkOutDate
            );

            // Se tudo deu certo, adiciona uma mensagem de sucesso
            SessionMessages.add(request, "reserva-efetuada-com-sucesso");

        } catch (InvalidReservationDatesException | RoomUnavailableException e) {
            // Se pegarmos uma de nossas exceções customizadas, adicionamos o erro na sessão
            SessionErrors.add(request, e.getClass().getName());
        } catch (Exception e) {
            // Para qualquer outro erro
            SessionErrors.add(request, "erro-generico");
            System.err.println(e);
        }
    }

        @ProcessAction(name = "cancelReservation")
        public void cancelReservation(ActionRequest request, ActionResponse response) {
            try {
                long reservationId = ParamUtil.getLong(request, "reservationId");
                _reservationLocalService.cancelReservation(reservationId);
                SessionMessages.add(request, "reserva-cancelada-com-sucesso");
            } catch (Exception e) {
                SessionErrors.add(request, "erro-generico");
                System.err.println(e);
            }
        }



    @Reference
    private RoomLocalService _roomLocalService;

    @Reference
    private ReservationLocalService _reservationLocalService;

    @Reference
    private DLAppService _dlAppService;
}