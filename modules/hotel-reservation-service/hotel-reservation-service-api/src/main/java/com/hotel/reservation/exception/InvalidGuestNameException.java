package com.hotel.reservation.exception;

import com.liferay.portal.kernel.exception.PortalException;

public class InvalidGuestNameException extends PortalException {

    public InvalidGuestNameException(String message) {
        super(message);
    }

    public InvalidGuestNameException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public InvalidGuestNameException(Throwable cause) {
        super(cause);
    }

}
