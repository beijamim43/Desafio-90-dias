/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.model.impl;

import com.hotel.reservation.model.Reservation;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.math.BigDecimal;

import java.util.Date;

/**
 * The cache model class for representing Reservation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ReservationCacheModel
	implements CacheModel<Reservation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ReservationCacheModel)) {
			return false;
		}

		ReservationCacheModel reservationCacheModel =
			(ReservationCacheModel)object;

		if (reservationId == reservationCacheModel.reservationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, reservationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{reservationId=");
		sb.append(reservationId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", roomId=");
		sb.append(roomId);
		sb.append(", guestName=");
		sb.append(guestName);
		sb.append(", guestEmail=");
		sb.append(guestEmail);
		sb.append(", checkInDate=");
		sb.append(checkInDate);
		sb.append(", checkOutDate=");
		sb.append(checkOutDate);
		sb.append(", totalAmount=");
		sb.append(totalAmount);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Reservation toEntityModel() {
		ReservationImpl reservationImpl = new ReservationImpl();

		reservationImpl.setReservationId(reservationId);
		reservationImpl.setGroupId(groupId);
		reservationImpl.setCompanyId(companyId);
		reservationImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			reservationImpl.setCreateDate(null);
		}
		else {
			reservationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			reservationImpl.setModifiedDate(null);
		}
		else {
			reservationImpl.setModifiedDate(new Date(modifiedDate));
		}

		reservationImpl.setRoomId(roomId);

		if (guestName == null) {
			reservationImpl.setGuestName("");
		}
		else {
			reservationImpl.setGuestName(guestName);
		}

		if (guestEmail == null) {
			reservationImpl.setGuestEmail("");
		}
		else {
			reservationImpl.setGuestEmail(guestEmail);
		}

		if (checkInDate == Long.MIN_VALUE) {
			reservationImpl.setCheckInDate(null);
		}
		else {
			reservationImpl.setCheckInDate(new Date(checkInDate));
		}

		if (checkOutDate == Long.MIN_VALUE) {
			reservationImpl.setCheckOutDate(null);
		}
		else {
			reservationImpl.setCheckOutDate(new Date(checkOutDate));
		}

		reservationImpl.setTotalAmount(totalAmount);
		reservationImpl.setStatus(status);

		reservationImpl.resetOriginalValues();

		return reservationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput)
		throws ClassNotFoundException, IOException {

		reservationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		roomId = objectInput.readLong();
		guestName = objectInput.readUTF();
		guestEmail = objectInput.readUTF();
		checkInDate = objectInput.readLong();
		checkOutDate = objectInput.readLong();
		totalAmount = (BigDecimal)objectInput.readObject();

		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(reservationId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(roomId);

		if (guestName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(guestName);
		}

		if (guestEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(guestEmail);
		}

		objectOutput.writeLong(checkInDate);
		objectOutput.writeLong(checkOutDate);
		objectOutput.writeObject(totalAmount);

		objectOutput.writeInt(status);
	}

	public long reservationId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long roomId;
	public String guestName;
	public String guestEmail;
	public long checkInDate;
	public long checkOutDate;
	public BigDecimal totalAmount;
	public int status;

}