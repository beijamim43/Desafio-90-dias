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
 * The table class for the &quot;Room&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Room
 * @generated
 */
public class RoomTable extends BaseTable<RoomTable> {

	public static final RoomTable INSTANCE = new RoomTable();

	public final Column<RoomTable, Long> roomId = createColumn(
		"roomId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RoomTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RoomTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RoomTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RoomTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RoomTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RoomTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RoomTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RoomTable, String> imageUrl = createColumn(
		"imageUrl", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RoomTable, Integer> maxGuests = createColumn(
		"maxGuests", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<RoomTable, BigDecimal> dailyRate = createColumn(
		"dailyRate", BigDecimal.class, Types.DECIMAL, Column.FLAG_DEFAULT);
	public final Column<RoomTable, String> amenities = createColumn(
		"amenities", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RoomTable, Boolean> status = createColumn(
		"status", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);

	private RoomTable() {
		super("Room", RoomTable::new);
	}

}