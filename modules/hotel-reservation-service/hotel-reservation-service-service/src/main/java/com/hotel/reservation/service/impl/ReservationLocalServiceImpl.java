package com.hotel.reservation.service.impl;

import com.hotel.reservation.exception.*;
import com.hotel.reservation.model.Reservation;
import com.hotel.reservation.model.Room;
import com.hotel.reservation.service.RoomLocalServiceUtil;
import com.hotel.reservation.service.base.ReservationLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
        property = "model.class.name=com.hotel.reservation.model.Reservation",
        service = AopService.class
)
public class ReservationLocalServiceImpl
        extends ReservationLocalServiceBaseImpl {

    public Reservation addReservation(long groupId, long companyId, long userId, long roomId, String guestName, String guestEmail,
                                      Date checkInDate, Date checkOutDate)
            throws PortalException, InvalidGuestNameException {

        validadereservation(checkInDate, checkOutDate);
        validateEmail(guestEmail);
        validateName(guestName);
        validateRoom(roomId, checkInDate, checkOutDate);

        Room room = RoomLocalServiceUtil.getRoom(roomId);
        long diffInMillies = Math.abs(checkOutDate.getTime() - checkInDate.getTime());
        long numberOfDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        BigDecimal totalAmount = room.getDailyRate().multiply(new BigDecimal(numberOfDays));

        Reservation reserva = reservationPersistence.create(counterLocalService.increment());

        reserva.setGroupId(groupId);
        reserva.setCompanyId(companyId);
        reserva.setUserId(userId);
        reserva.setCreateDate(new Date());
        reserva.setModifiedDate(new Date());

        reserva.setRoomId(roomId);
        reserva.setGuestName(guestName);
        reserva.setGuestEmail(guestEmail);
        reserva.setCheckInDate(checkInDate);
        reserva.setCheckOutDate(checkOutDate);

        reserva.setTotalAmount(totalAmount);
        reserva.setStatus(Reservation.STATUS_CONFIRMADA);

        return reservationPersistence.update(reserva);
    }

    public Reservation cancelReservation(long reservationId) throws NoSuchReservationException {
        Reservation reserva = reservationPersistence.findByPrimaryKey(reservationId);

        reserva.setStatus(Reservation.STATUS_CANCELADA);
        reserva.setModifiedDate(new Date());

        return reservationPersistence.update(reserva);
    }

    private void validadereservation(Date checkInDate, Date checkOutDate) throws InvalidReservationDatesException {
        if (checkInDate.after(checkOutDate) || checkInDate.equals(checkOutDate)) {
            throw new InvalidReservationDatesException("A data de check-out deve ser posterior à data de check-in.");
        }
    }

    private void validateEmail(String email) throws InvalidEmailAddressException {
        if (email == null || email.isEmpty() || !email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidEmailAddressException("E-mail inválido");
        }
    }

    private void validateName(String guestName) throws InvalidGuestNameException {
        if (guestName == null || guestName.isEmpty()) {
            throw new InvalidGuestNameException("Nome inválido");
        }
    }

    private void validateRoom(long roomId, Date checkInDate, Date checkOutDate) throws RoomUnavailableException {
        // 1. Busca todas as reservas existentes para este quarto.
        // Usamos o finder 'findByRoomId' que o Service Builder gerou para nós.
        List<Reservation> reservasExistentes = reservationPersistence.findByRoomId(roomId);

        // 2. Percorre a lista de reservas encontradas.
        for (Reservation reservaExistente : reservasExistentes) {

            // Se a reserva encontrada já estiver cancelada, ignore-a e pule para a próxima.
            if (reservaExistente.getStatus() == Reservation.STATUS_CANCELADA) {
                continue;
            }

            // 3. A MÁGICA ACONTECE AQUI: A Lógica de Sobreposição de Datas
            // Um conflito existe se:
            // A nova data de CHECK-IN for ANTES da data de CHECK-OUT existente
            // E
            // A nova data de CHECK-OUT for DEPOIS da data de CHECK-IN existente

            boolean haConflito =
                    checkInDate.before(reservaExistente.getCheckOutDate()) &&
                            checkOutDate.after(reservaExistente.getCheckInDate());

            if (haConflito) {
                // 4. Se encontrou um conflito, lança a exceção imediatamente e para a verificação.
                throw new RoomUnavailableException("O quarto não está disponível para este período.");
            }
        }
    }


}