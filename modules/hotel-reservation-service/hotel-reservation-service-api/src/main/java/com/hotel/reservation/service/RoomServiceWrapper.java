/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RoomService}.
 *
 * @author Brian Wing Shun Chan
 * @see RoomService
 * @generated
 */
public class RoomServiceWrapper
	implements RoomService, ServiceWrapper<RoomService> {

	public RoomServiceWrapper() {
		this(null);
	}

	public RoomServiceWrapper(RoomService roomService) {
		_roomService = roomService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _roomService.getOSGiServiceIdentifier();
	}

	@Override
	public RoomService getWrappedService() {
		return _roomService;
	}

	@Override
	public void setWrappedService(RoomService roomService) {
		_roomService = roomService;
	}

	private RoomService _roomService;

}