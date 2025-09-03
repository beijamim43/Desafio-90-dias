package com.hotel.reservation.exception;

import com.liferay.portal.kernel.exception.PortalException;

public class InvalidEmailAddressException extends PortalException {

    public InvalidEmailAddressException(String message) {
        super(message);
    }

    public InvalidEmailAddressException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public InvalidEmailAddressException(Throwable cause) {
        super(cause);
    }
}
