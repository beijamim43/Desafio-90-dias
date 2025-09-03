/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Reservation service. Represents a row in the &quot;Reservation&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ReservationModel
 * @generated
 */
@ImplementationClassName("com.hotel.reservation.model.impl.ReservationImpl")
@ProviderType
public interface Reservation extends PersistedModel, ReservationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.hotel.reservation.model.impl.ReservationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Reservation, Long> RESERVATION_ID_ACCESSOR =
		new Accessor<Reservation, Long>() {

			@Override
			public Long get(Reservation reservation) {
				return reservation.getReservationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Reservation> getTypeClass() {
				return Reservation.class;
			}

		};
    public static final int STATUS_CONFIRMADA = 0;
    public static final int STATUS_CANCELADA = 1;

}