package com.hotel.reservation.exception;

import com.liferay.portal.kernel.exception.PortalException;

public class InvalidReservationDatesException extends PortalException {

    public InvalidReservationDatesException() {
    }

    public InvalidReservationDatesException(String msg) {
        super(msg);
    }

    public InvalidReservationDatesException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public InvalidReservationDatesException(Throwable cause) {
        super(cause);
    }

}