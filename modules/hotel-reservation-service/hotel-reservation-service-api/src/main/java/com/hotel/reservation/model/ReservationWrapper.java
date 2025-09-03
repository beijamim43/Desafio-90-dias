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
 * This class is a wrapper for {@link Reservation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Reservation
 * @generated
 */
public class ReservationWrapper
	extends BaseModelWrapper<Reservation>
	implements ModelWrapper<Reservation>, Reservation {

	public ReservationWrapper(Reservation reservation) {
		super(reservation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("reservationId", getReservationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("roomId", getRoomId());
		attributes.put("guestName", getGuestName());
		attributes.put("guestEmail", getGuestEmail());
		attributes.put("checkInDate", getCheckInDate());
		attributes.put("checkOutDate", getCheckOutDate());
		attributes.put("totalAmount", getTotalAmount());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long reservationId = (Long)attributes.get("reservationId");

		if (reservationId != null) {
			setReservationId(reservationId);
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

		Long roomId = (Long)attributes.get("roomId");

		if (roomId != null) {
			setRoomId(roomId);
		}

		String guestName = (String)attributes.get("guestName");

		if (guestName != null) {
			setGuestName(guestName);
		}

		String guestEmail = (String)attributes.get("guestEmail");

		if (guestEmail != null) {
			setGuestEmail(guestEmail);
		}

		Date checkInDate = (Date)attributes.get("checkInDate");

		if (checkInDate != null) {
			setCheckInDate(checkInDate);
		}

		Date checkOutDate = (Date)attributes.get("checkOutDate");

		if (checkOutDate != null) {
			setCheckOutDate(checkOutDate);
		}

		BigDecimal totalAmount = (BigDecimal)attributes.get("totalAmount");

		if (totalAmount != null) {
			setTotalAmount(totalAmount);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public Reservation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the check in date of this reservation.
	 *
	 * @return the check in date of this reservation
	 */
	@Override
	public Date getCheckInDate() {
		return model.getCheckInDate();
	}

	/**
	 * Returns the check out date of this reservation.
	 *
	 * @return the check out date of this reservation
	 */
	@Override
	public Date getCheckOutDate() {
		return model.getCheckOutDate();
	}

	/**
	 * Returns the company ID of this reservation.
	 *
	 * @return the company ID of this reservation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this reservation.
	 *
	 * @return the create date of this reservation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this reservation.
	 *
	 * @return the group ID of this reservation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the guest email of this reservation.
	 *
	 * @return the guest email of this reservation
	 */
	@Override
	public String getGuestEmail() {
		return model.getGuestEmail();
	}

	/**
	 * Returns the guest name of this reservation.
	 *
	 * @return the guest name of this reservation
	 */
	@Override
	public String getGuestName() {
		return model.getGuestName();
	}

	/**
	 * Returns the modified date of this reservation.
	 *
	 * @return the modified date of this reservation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this reservation.
	 *
	 * @return the primary key of this reservation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the reservation ID of this reservation.
	 *
	 * @return the reservation ID of this reservation
	 */
	@Override
	public long getReservationId() {
		return model.getReservationId();
	}

	/**
	 * Returns the room ID of this reservation.
	 *
	 * @return the room ID of this reservation
	 */
	@Override
	public long getRoomId() {
		return model.getRoomId();
	}

	/**
	 * Returns the status of this reservation.
	 *
	 * @return the status of this reservation
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the total amount of this reservation.
	 *
	 * @return the total amount of this reservation
	 */
	@Override
	public BigDecimal getTotalAmount() {
		return model.getTotalAmount();
	}

	/**
	 * Returns the user ID of this reservation.
	 *
	 * @return the user ID of this reservation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this reservation.
	 *
	 * @return the user uuid of this reservation
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the check in date of this reservation.
	 *
	 * @param checkInDate the check in date of this reservation
	 */
	@Override
	public void setCheckInDate(Date checkInDate) {
		model.setCheckInDate(checkInDate);
	}

	/**
	 * Sets the check out date of this reservation.
	 *
	 * @param checkOutDate the check out date of this reservation
	 */
	@Override
	public void setCheckOutDate(Date checkOutDate) {
		model.setCheckOutDate(checkOutDate);
	}

	/**
	 * Sets the company ID of this reservation.
	 *
	 * @param companyId the company ID of this reservation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this reservation.
	 *
	 * @param createDate the create date of this reservation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this reservation.
	 *
	 * @param groupId the group ID of this reservation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the guest email of this reservation.
	 *
	 * @param guestEmail the guest email of this reservation
	 */
	@Override
	public void setGuestEmail(String guestEmail) {
		model.setGuestEmail(guestEmail);
	}

	/**
	 * Sets the guest name of this reservation.
	 *
	 * @param guestName the guest name of this reservation
	 */
	@Override
	public void setGuestName(String guestName) {
		model.setGuestName(guestName);
	}

	/**
	 * Sets the modified date of this reservation.
	 *
	 * @param modifiedDate the modified date of this reservation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this reservation.
	 *
	 * @param primaryKey the primary key of this reservation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the reservation ID of this reservation.
	 *
	 * @param reservationId the reservation ID of this reservation
	 */
	@Override
	public void setReservationId(long reservationId) {
		model.setReservationId(reservationId);
	}

	/**
	 * Sets the room ID of this reservation.
	 *
	 * @param roomId the room ID of this reservation
	 */
	@Override
	public void setRoomId(long roomId) {
		model.setRoomId(roomId);
	}

	/**
	 * Sets the status of this reservation.
	 *
	 * @param status the status of this reservation
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the total amount of this reservation.
	 *
	 * @param totalAmount the total amount of this reservation
	 */
	@Override
	public void setTotalAmount(BigDecimal totalAmount) {
		model.setTotalAmount(totalAmount);
	}

	/**
	 * Sets the user ID of this reservation.
	 *
	 * @param userId the user ID of this reservation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this reservation.
	 *
	 * @param userUuid the user uuid of this reservation
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
	protected ReservationWrapper wrap(Reservation reservation) {
		return new ReservationWrapper(reservation);
	}

}