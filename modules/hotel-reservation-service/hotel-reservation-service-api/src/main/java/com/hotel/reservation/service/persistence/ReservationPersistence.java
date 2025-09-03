/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.service.persistence;

import com.hotel.reservation.exception.NoSuchReservationException;
import com.hotel.reservation.model.Reservation;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the reservation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReservationUtil
 * @generated
 */
@ProviderType
public interface ReservationPersistence extends BasePersistence<Reservation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ReservationUtil} to access the reservation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the reservations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching reservations
	 */
	public java.util.List<Reservation> findByGroupId(long groupId);

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
	public java.util.List<Reservation> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<Reservation> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

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
	public java.util.List<Reservation> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first reservation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the first reservation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

	/**
	 * Returns the last reservation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the last reservation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

	/**
	 * Returns the reservations before and after the current reservation in the ordered set where groupId = &#63;.
	 *
	 * @param reservationId the primary key of the current reservation
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public Reservation[] findByGroupId_PrevAndNext(
			long reservationId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Removes all the reservations where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of reservations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching reservations
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the reservations where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @return the matching reservations
	 */
	public java.util.List<Reservation> findByRoomId(long roomId);

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
	public java.util.List<Reservation> findByRoomId(
		long roomId, int start, int end);

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
	public java.util.List<Reservation> findByRoomId(
		long roomId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

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
	public java.util.List<Reservation> findByRoomId(
		long roomId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first reservation in the ordered set where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByRoomId_First(
			long roomId,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the first reservation in the ordered set where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByRoomId_First(
		long roomId,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

	/**
	 * Returns the last reservation in the ordered set where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByRoomId_Last(
			long roomId,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the last reservation in the ordered set where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByRoomId_Last(
		long roomId,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

	/**
	 * Returns the reservations before and after the current reservation in the ordered set where roomId = &#63;.
	 *
	 * @param reservationId the primary key of the current reservation
	 * @param roomId the room ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public Reservation[] findByRoomId_PrevAndNext(
			long reservationId, long roomId,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Removes all the reservations where roomId = &#63; from the database.
	 *
	 * @param roomId the room ID
	 */
	public void removeByRoomId(long roomId);

	/**
	 * Returns the number of reservations where roomId = &#63;.
	 *
	 * @param roomId the room ID
	 * @return the number of matching reservations
	 */
	public int countByRoomId(long roomId);

	/**
	 * Returns all the reservations where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching reservations
	 */
	public java.util.List<Reservation> findByG_S(long groupId, int status);

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
	public java.util.List<Reservation> findByG_S(
		long groupId, int status, int start, int end);

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
	public java.util.List<Reservation> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

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
	public java.util.List<Reservation> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first reservation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByG_S_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the first reservation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

	/**
	 * Returns the last reservation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByG_S_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the last reservation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

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
	public Reservation[] findByG_S_PrevAndNext(
			long reservationId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Removes all the reservations where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, int status);

	/**
	 * Returns the number of reservations where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching reservations
	 */
	public int countByG_S(long groupId, int status);

	/**
	 * Returns all the reservations where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @return the matching reservations
	 */
	public java.util.List<Reservation> findByR_S(long roomId, int status);

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
	public java.util.List<Reservation> findByR_S(
		long roomId, int status, int start, int end);

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
	public java.util.List<Reservation> findByR_S(
		long roomId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

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
	public java.util.List<Reservation> findByR_S(
		long roomId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first reservation in the ordered set where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByR_S_First(
			long roomId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the first reservation in the ordered set where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByR_S_First(
		long roomId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

	/**
	 * Returns the last reservation in the ordered set where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByR_S_Last(
			long roomId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the last reservation in the ordered set where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByR_S_Last(
		long roomId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

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
	public Reservation[] findByR_S_PrevAndNext(
			long reservationId, long roomId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Removes all the reservations where roomId = &#63; and status = &#63; from the database.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 */
	public void removeByR_S(long roomId, int status);

	/**
	 * Returns the number of reservations where roomId = &#63; and status = &#63;.
	 *
	 * @param roomId the room ID
	 * @param status the status
	 * @return the number of matching reservations
	 */
	public int countByR_S(long roomId, int status);

	/**
	 * Caches the reservation in the entity cache if it is enabled.
	 *
	 * @param reservation the reservation
	 */
	public void cacheResult(Reservation reservation);

	/**
	 * Caches the reservations in the entity cache if it is enabled.
	 *
	 * @param reservations the reservations
	 */
	public void cacheResult(java.util.List<Reservation> reservations);

	/**
	 * Creates a new reservation with the primary key. Does not add the reservation to the database.
	 *
	 * @param reservationId the primary key for the new reservation
	 * @return the new reservation
	 */
	public Reservation create(long reservationId);

	/**
	 * Removes the reservation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reservationId the primary key of the reservation
	 * @return the reservation that was removed
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public Reservation remove(long reservationId)
		throws NoSuchReservationException;

	public Reservation updateImpl(Reservation reservation);

	/**
	 * Returns the reservation with the primary key or throws a <code>NoSuchReservationException</code> if it could not be found.
	 *
	 * @param reservationId the primary key of the reservation
	 * @return the reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public Reservation findByPrimaryKey(long reservationId)
		throws NoSuchReservationException;

	/**
	 * Returns the reservation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param reservationId the primary key of the reservation
	 * @return the reservation, or <code>null</code> if a reservation with the primary key could not be found
	 */
	public Reservation fetchByPrimaryKey(long reservationId);

	/**
	 * Returns all the reservations.
	 *
	 * @return the reservations
	 */
	public java.util.List<Reservation> findAll();

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
	public java.util.List<Reservation> findAll(int start, int end);

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
	public java.util.List<Reservation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

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
	public java.util.List<Reservation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the reservations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of reservations.
	 *
	 * @return the number of reservations
	 */
	public int countAll();

}