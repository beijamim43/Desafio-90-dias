/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ReservationService}.
 *
 * @author Brian Wing Shun Chan
 * @see ReservationService
 * @generated
 */
public class ReservationServiceWrapper
	implements ReservationService, ServiceWrapper<ReservationService> {

	public ReservationServiceWrapper() {
		this(null);
	}

	public ReservationServiceWrapper(ReservationService reservationService) {
		_reservationService = reservationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _reservationService.getOSGiServiceIdentifier();
	}

	@Override
	public ReservationService getWrappedService() {
		return _reservationService;
	}

	@Override
	public void setWrappedService(ReservationService reservationService) {
		_reservationService = reservationService;
	}

	private ReservationService _reservationService;

}