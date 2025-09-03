/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.model.impl;

import com.hotel.reservation.model.Room;

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
 * The cache model class for representing Room in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RoomCacheModel implements CacheModel<Room>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RoomCacheModel)) {
			return false;
		}

		RoomCacheModel roomCacheModel = (RoomCacheModel)object;

		if (roomId == roomCacheModel.roomId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, roomId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{roomId=");
		sb.append(roomId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", imageUrl=");
		sb.append(imageUrl);
		sb.append(", maxGuests=");
		sb.append(maxGuests);
		sb.append(", dailyRate=");
		sb.append(dailyRate);
		sb.append(", amenities=");
		sb.append(amenities);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Room toEntityModel() {
		RoomImpl roomImpl = new RoomImpl();

		roomImpl.setRoomId(roomId);
		roomImpl.setGroupId(groupId);
		roomImpl.setCompanyId(companyId);
		roomImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			roomImpl.setCreateDate(null);
		}
		else {
			roomImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			roomImpl.setModifiedDate(null);
		}
		else {
			roomImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			roomImpl.setName("");
		}
		else {
			roomImpl.setName(name);
		}

		if (description == null) {
			roomImpl.setDescription("");
		}
		else {
			roomImpl.setDescription(description);
		}

		if (imageUrl == null) {
			roomImpl.setImageUrl("");
		}
		else {
			roomImpl.setImageUrl(imageUrl);
		}

		roomImpl.setMaxGuests(maxGuests);
		roomImpl.setDailyRate(dailyRate);

		if (amenities == null) {
			roomImpl.setAmenities("");
		}
		else {
			roomImpl.setAmenities(amenities);
		}

		roomImpl.setStatus(status);

		roomImpl.resetOriginalValues();

		return roomImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput)
		throws ClassNotFoundException, IOException {

		roomId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		imageUrl = objectInput.readUTF();

		maxGuests = objectInput.readInt();
		dailyRate = (BigDecimal)objectInput.readObject();
		amenities = objectInput.readUTF();

		status = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(roomId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (imageUrl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(imageUrl);
		}

		objectOutput.writeInt(maxGuests);
		objectOutput.writeObject(dailyRate);

		if (amenities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amenities);
		}

		objectOutput.writeBoolean(status);
	}

	public long roomId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String description;
	public String imageUrl;
	public int maxGuests;
	public BigDecimal dailyRate;
	public String amenities;
	public boolean status;

}