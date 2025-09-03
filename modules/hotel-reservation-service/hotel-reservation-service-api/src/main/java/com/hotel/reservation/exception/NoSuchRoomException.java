/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.hotel.reservation.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchRoomException extends NoSuchModelException {

	public NoSuchRoomException() {
	}

	public NoSuchRoomException(String msg) {
		super(msg);
	}

	public NoSuchRoomException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchRoomException(Throwable throwable) {
		super(throwable);
	}

}