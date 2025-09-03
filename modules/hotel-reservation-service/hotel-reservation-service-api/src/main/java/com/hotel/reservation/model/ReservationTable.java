/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.math.BigDecimal;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Reservation&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Reservation
 * @generated
 */
public class ReservationTable extends BaseTable<ReservationTable> {

	public static final ReservationTable INSTANCE = new ReservationTable();

	public final Column<ReservationTable, Long> reservationId = createColumn(
		"reservationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ReservationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Long> roomId = createColumn(
		"roomId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, String> guestName = createColumn(
		"guestName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, String> guestEmail = createColumn(
		"guestEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Date> checkInDate = createColumn(
		"checkInDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Date> checkOutDate = createColumn(
		"checkOutDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, BigDecimal> totalAmount =
		createColumn(
			"totalAmount", BigDecimal.class, Types.DECIMAL,
			Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private ReservationTable() {
		super("Reservation", ReservationTable::new);
	}

}