/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.math.BigDecimal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Room}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Room
 * @generated
 */
public class RoomWrapper
	extends BaseModelWrapper<Room> implements ModelWrapper<Room>, Room {

	public RoomWrapper(Room room) {
		super(room);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("roomId", getRoomId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("ImageFileEntryId", getImageFileEntryId());
		attributes.put("maxGuests", getMaxGuests());
		attributes.put("dailyRate", getDailyRate());
		attributes.put("amenities", getAmenities());
		attributes.put("status", isStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long roomId = (Long)attributes.get("roomId");

		if (roomId != null) {
			setRoomId(roomId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long ImageFileEntryId = (Long)attributes.get("ImageFileEntryId");

		if (ImageFileEntryId != null) {
			setImageFileEntryId(ImageFileEntryId);
		}

		Integer maxGuests = (Integer)attributes.get("maxGuests");

		if (maxGuests != null) {
			setMaxGuests(maxGuests);
		}

		BigDecimal dailyRate = (BigDecimal)attributes.get("dailyRate");

		if (dailyRate != null) {
			setDailyRate(dailyRate);
		}

		String amenities = (String)attributes.get("amenities");

		if (amenities != null) {
			setAmenities(amenities);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public Room cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amenities of this room.
	 *
	 * @return the amenities of this room
	 */
	@Override
	public String getAmenities() {
		return model.getAmenities();
	}

	/**
	 * Returns the company ID of this room.
	 *
	 * @return the company ID of this room
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this room.
	 *
	 * @return the create date of this room
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the daily rate of this room.
	 *
	 * @return the daily rate of this room
	 */
	@Override
	public BigDecimal getDailyRate() {
		return model.getDailyRate();
	}

	/**
	 * Returns the description of this room.
	 *
	 * @return the description of this room
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this room.
	 *
	 * @return the group ID of this room
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the image file entry ID of this room.
	 *
	 * @return the image file entry ID of this room
	 */
	@Override
	public long getImageFileEntryId() {
		return model.getImageFileEntryId();
	}

	/**
	 * Returns the max guests of this room.
	 *
	 * @return the max guests of this room
	 */
	@Override
	public int getMaxGuests() {
		return model.getMaxGuests();
	}

	/**
	 * Returns the modified date of this room.
	 *
	 * @return the modified date of this room
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this room.
	 *
	 * @return the name of this room
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this room.
	 *
	 * @return the primary key of this room
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the room ID of this room.
	 *
	 * @return the room ID of this room
	 */
	@Override
	public long getRoomId() {
		return model.getRoomId();
	}

	/**
	 * Returns the status of this room.
	 *
	 * @return the status of this room
	 */
	@Override
	public boolean getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this room.
	 *
	 * @return the user ID of this room
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this room.
	 *
	 * @return the user uuid of this room
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns <code>true</code> if this room is status.
	 *
	 * @return <code>true</code> if this room is status; <code>false</code> otherwise
	 */
	@Override
	public boolean isStatus() {
		return model.isStatus();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the amenities of this room.
	 *
	 * @param amenities the amenities of this room
	 */
	@Override
	public void setAmenities(String amenities) {
		model.setAmenities(amenities);
	}

	/**
	 * Sets the company ID of this room.
	 *
	 * @param companyId the company ID of this room
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this room.
	 *
	 * @param createDate the create date of this room
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the daily rate of this room.
	 *
	 * @param dailyRate the daily rate of this room
	 */
	@Override
	public void setDailyRate(BigDecimal dailyRate) {
		model.setDailyRate(dailyRate);
	}

	/**
	 * Sets the description of this room.
	 *
	 * @param description the description of this room
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this room.
	 *
	 * @param groupId the group ID of this room
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the image file entry ID of this room.
	 *
	 * @param ImageFileEntryId the image file entry ID of this room
	 */
	@Override
	public void setImageFileEntryId(long ImageFileEntryId) {
		model.setImageFileEntryId(ImageFileEntryId);
	}

	/**
	 * Sets the max guests of this room.
	 *
	 * @param maxGuests the max guests of this room
	 */
	@Override
	public void setMaxGuests(int maxGuests) {
		model.setMaxGuests(maxGuests);
	}

	/**
	 * Sets the modified date of this room.
	 *
	 * @param modifiedDate the modified date of this room
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this room.
	 *
	 * @param name the name of this room
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this room.
	 *
	 * @param primaryKey the primary key of this room
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the room ID of this room.
	 *
	 * @param roomId the room ID of this room
	 */
	@Override
	public void setRoomId(long roomId) {
		model.setRoomId(roomId);
	}

	/**
	 * Sets whether this room is status.
	 *
	 * @param status the status of this room
	 */
	@Override
	public void setStatus(boolean status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this room.
	 *
	 * @param userId the user ID of this room
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this room.
	 *
	 * @param userUuid the user uuid of this room
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected RoomWrapper wrap(Room room) {
		return new RoomWrapper(room);
	}

}