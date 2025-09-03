/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.hotel.reservation.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchReservationException extends NoSuchModelException {

	public NoSuchReservationException() {
	}

	public NoSuchReservationException(String msg) {
		super(msg);
	}

	public NoSuchReservationException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchReservationException(Throwable throwable) {
		super(throwable);
	}

}