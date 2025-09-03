<%@ include file="/init.jsp" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hotel.reservation.model.Room" %>
<%@ page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@ page import="com.liferay.document.library.kernel.service.DLAppServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>

<%-- Tags para exibir mensagens de sucesso e erro --%>
<liferay-ui:success key="reserva-efetuada-com-sucesso" message="reserva-efetuada-com-sucesso" />
<liferay-ui:error key="com.hotel.reservation.exception.InvalidReservationDatesException" message="erro-datas-invalidas" />
<liferay-ui:error key="com.hotel.reservation.exception.RoomUnavailableException" message="erro-quarto-indisponivel" />

<%
    // Pega a lista de quartos que o Portlet nos enviou
    List<Room> rooms = (List<Room>) request.getAttribute("rooms");
%>

<div class="container-fluid">
    <div class="row">
        <% for (Room room : rooms) { %>
        <div class="col-md-4">
            <div class="card mb-4">
                <%
                    // Lógica para buscar a URL da imagem a partir do ID salvo
                    String imageUrl = null;
                    if (room.getImageFileEntryId() > 0) {
                        try {
                            FileEntry fileEntry = DLAppServiceUtil.getFileEntry(room.getImageFileEntryId());
                            imageUrl = themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + "/" + fileEntry.getFolderId() + "/" + fileEntry.getTitle() + "/" + fileEntry.getUuid();
                        } catch (Exception e) {}
                    }
                %>
                <% if (Validator.isNotNull(imageUrl)) { %>
                <img src="<%= imageUrl %>" class="card-img-top" alt="<%= room.getName() %>">
                <% } %>

                <div class="card-body">
                    <h5 class="card-title"><%= room.getName() %></h5>
                    <p class="card-text"><%= room.getDescription() %></p>
                    <p><strong>Diária:</strong> R$ <%= room.getDailyRate() %></p>
                    <p><strong>Comodidades:</strong> <%= room.getAmenities() %></p>

                    <hr>
                    <h6>Fazer Reserva</h6>
                    <portlet:actionURL name="addReservation" var="addReservationURL" />
                    <aui:form action="${addReservationURL}" method="post">
                        <aui:input name="roomId" type="hidden" value="<%= room.getRoomId() %>" />
                        <aui:input name="guestName" label="Nome do Hóspede">
                            <aui:validator name="required" />
                        </aui:input>
                        <aui:input name="guestEmail" label="E-mail">
                            <aui:validator name="required" />
                            <aui:validator name="email" />
                        </aui:input>
                        <aui:input name="checkInDate" type="date" label="Check-in"/>
                        <aui:input name="checkOutDate" type="date" label="Check-out"/>
                        <aui:button type="submit" value="Reservar" />
                    </aui:form>
                </div>
            </div>
        </div>
        <% } %>
    </div>
</div>