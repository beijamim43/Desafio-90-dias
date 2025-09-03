package com.hotel.reservation.exception;

import com.liferay.portal.kernel.exception.PortalException;

public class RoomUnavailableException extends PortalException {
    public RoomUnavailableException(String message) {
        super(message);
    }
    public RoomUnavailableException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public RoomUnavailableException(Throwable cause) {
        super(cause);
    }
}
