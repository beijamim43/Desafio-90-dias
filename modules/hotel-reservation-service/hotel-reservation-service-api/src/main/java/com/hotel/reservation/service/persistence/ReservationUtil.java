/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.service.persistence;

import com.hotel.reservation.model.Reservation;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the reservation service. This utility wraps <code>com.hotel.reservation.service.persistence.impl.ReservationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReservationPersistence
 * @generated
 */
public class ReservationUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Reservation reservation) {
		getPersistence().clearCache(reservation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Reservation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Reservation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Reservation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Reservation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Reservation update(Reservation reservation) {
		return getPersistence().update(reservation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Reservation update(
		Reservation reservation, ServiceContext serviceContext) {

		return getPersistence().update(reservation, serviceContext);
	}

	/**
	 * Returns all the reservations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching reservations
	 */
	public static List<Reservation> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the reservations where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @return the range of matching reservations
	 */
	public static List<Reservation> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the reservations where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservations where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Reservation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first reservation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByGroupId_First(
			long groupId, OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first reservation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByGroupId_First(
		long groupId, OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByGroupId_Last(
			long groupId, OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByGroupId_Last(
		long groupId, OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the reservations before and after the current reservation in the ordered set where groupId = &#63;.
	 *
	 * @param reservationId the primary key of the current reservation
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public static Reservation[] findByGroupId_PrevAndNext(
			long reservationId, long groupId,
			OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByGroupId_PrevAndNext(
			reservationId, groupId, orderByComparator);
	}

	/**
	 * Removes all the reservations where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of reservations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching reservations
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the reservations where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @return the matching reservations
	 */
	public static List<Reservation> findByRoomId(long roomId) {
		return getPersistence().findByRoomId(roomId);
	}

	/**
	 * Returns a range of all the reservations where roomId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param roomId the room ID
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @return the range of matching reservations
	 */
	public static List<Reservation> findByRoomId(
		long roomId, int start, int end) {

		return getPersistence().findByRoomId(roomId, start, end);
	}

	/**
	 * Returns an ordered range of all the reservations where roomId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param roomId the room ID
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByRoomId(
		long roomId, int start, int end,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().findByRoomId(
			roomId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservations where roomId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param roomId the room ID
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByRoomId(
		long roomId, int start, int end,
		OrderByComparator<Reservation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByRoomId(
			roomId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first reservation in the ordered set where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByRoomId_First(
			long roomId, OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByRoomId_First(roomId, orderByComparator);
	}

	/**
	 * Returns the first reservation in the ordered set where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByRoomId_First(
		long roomId, OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByRoomId_First(roomId, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByRoomId_Last(
			long roomId, OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByRoomId_Last(roomId, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByRoomId_Last(
		long roomId, OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByRoomId_Last(roomId, orderByComparator);
	}

	/**
	 * Returns the reservations before and after the current reservation in the ordered set where roomId = &#63;.
	 *
	 * @param reservationId the primary key of the current reservation
	 * @param roomId the room ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public static Reservation[] findByRoomId_PrevAndNext(
			long reservationId, long roomId,
			OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByRoomId_PrevAndNext(
			reservationId, roomId, orderByComparator);
	}

	/**
	 * Removes all the reservations where roomId = &#63; from the database.
	 *
	 * @param roomId the room ID
	 */
	public static void removeByRoomId(long roomId) {
		getPersistence().removeByRoomId(roomId);
	}

	/**
	 * Returns the number of reservations where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @return the number of matching reservations
	 */
	public static int countByRoomId(long roomId) {
		return getPersistence().countByRoomId(roomId);
	}

	/**
	 * Returns all the reservations where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching reservations
	 */
	public static List<Reservation> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	 * Returns a range of all the reservations where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @return the range of matching reservations
	 */
	public static List<Reservation> findByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the reservations where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservations where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<Reservation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first reservation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByG_S_First(
			long groupId, int status,
			OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first reservation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByG_S_First(
		long groupId, int status,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByG_S_Last(
			long groupId, int status,
			OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByG_S_Last(
		long groupId, int status,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the reservations before and after the current reservation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param reservationId the primary key of the current reservation
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public static Reservation[] findByG_S_PrevAndNext(
			long reservationId, long groupId, int status,
			OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByG_S_PrevAndNext(
			reservationId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the reservations where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	 * Returns the number of reservations where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching reservations
	 */
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	 * Returns all the reservations where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @return the matching reservations
	 */
	public static List<Reservation> findByR_S(long roomId, int status) {
		return getPersistence().findByR_S(roomId, status);
	}

	/**
	 * Returns a range of all the reservations where roomId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @return the range of matching reservations
	 */
	public static List<Reservation> findByR_S(
		long roomId, int status, int start, int end) {

		return getPersistence().findByR_S(roomId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the reservations where roomId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByR_S(
		long roomId, int status, int start, int end,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().findByR_S(
			roomId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservations where roomId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByR_S(
		long roomId, int status, int start, int end,
		OrderByComparator<Reservation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByR_S(
			roomId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first reservation in the ordered set where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByR_S_First(
			long roomId, int status,
			OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByR_S_First(
			roomId, status, orderByComparator);
	}

	/**
	 * Returns the first reservation in the ordered set where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByR_S_First(
		long roomId, int status,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByR_S_First(
			roomId, status, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByR_S_Last(
			long roomId, int status,
			OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByR_S_Last(
			roomId, status, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByR_S_Last(
		long roomId, int status,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByR_S_Last(
			roomId, status, orderByComparator);
	}

	/**
	 * Returns the reservations before and after the current reservation in the ordered set where roomId = &#63; and status = &#63;.
	 *
	 * @param reservationId the primary key of the current reservation
	 * @param roomId the room ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public static Reservation[] findByR_S_PrevAndNext(
			long reservationId, long roomId, int status,
			OrderByComparator<Reservation> orderByComparator)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByR_S_PrevAndNext(
			reservationId, roomId, status, orderByComparator);
	}

	/**
	 * Removes all the reservations where roomId = &#63; and status = &#63; from the database.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 */
	public static void removeByR_S(long roomId, int status) {
		getPersistence().removeByR_S(roomId, status);
	}

	/**
	 * Returns the number of reservations where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @return the number of matching reservations
	 */
	public static int countByR_S(long roomId, int status) {
		return getPersistence().countByR_S(roomId, status);
	}

	/**
	 * Caches the reservation in the entity cache if it is enabled.
	 *
	 * @param reservation the reservation
	 */
	public static void cacheResult(Reservation reservation) {
		getPersistence().cacheResult(reservation);
	}

	/**
	 * Caches the reservations in the entity cache if it is enabled.
	 *
	 * @param reservations the reservations
	 */
	public static void cacheResult(List<Reservation> reservations) {
		getPersistence().cacheResult(reservations);
	}

	/**
	 * Creates a new reservation with the primary key. Does not add the reservation to the database.
	 *
	 * @param reservationId the primary key for the new reservation
	 * @return the new reservation
	 */
	public static Reservation create(long reservationId) {
		return getPersistence().create(reservationId);
	}

	/**
	 * Removes the reservation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reservationId the primary key of the reservation
	 * @return the reservation that was removed
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public static Reservation remove(long reservationId)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().remove(reservationId);
	}

	public static Reservation updateImpl(Reservation reservation) {
		return getPersistence().updateImpl(reservation);
	}

	/**
	 * Returns the reservation with the primary key or throws a <code>NoSuchReservationException</code> if it could not be found.
	 *
	 * @param reservationId the primary key of the reservation
	 * @return the reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public static Reservation findByPrimaryKey(long reservationId)
		throws com.hotel.reservation.exception.NoSuchReservationException {

		return getPersistence().findByPrimaryKey(reservationId);
	}

	/**
	 * Returns the reservation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param reservationId the primary key of the reservation
	 * @return the reservation, or <code>null</code> if a reservation with the primary key could not be found
	 */
	public static Reservation fetchByPrimaryKey(long reservationId) {
		return getPersistence().fetchByPrimaryKey(reservationId);
	}

	/**
	 * Returns all the reservations.
	 *
	 * @return the reservations
	 */
	public static List<Reservation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the reservations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @return the range of reservations
	 */
	public static List<Reservation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the reservations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of reservations
	 */
	public static List<Reservation> findAll(
		int start, int end, OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of reservations
	 */
	public static List<Reservation> findAll(
		int start, int end, OrderByComparator<Reservation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the reservations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of reservations.
	 *
	 * @return the number of reservations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ReservationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ReservationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ReservationPersistence _persistence;

}