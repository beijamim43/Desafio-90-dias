/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.service.persistence;

import com.hotel.reservation.exception.NoSuchRoomException;
import com.hotel.reservation.model.Room;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the room service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoomUtil
 * @generated
 */
@ProviderType
public interface RoomPersistence extends BasePersistence<Room> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RoomUtil} to access the room persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the rooms where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching rooms
	 */
	public java.util.List<Room> findByGroupId(long groupId);

	/**
	 * Returns a range of all the rooms where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of matching rooms
	 */
	public java.util.List<Room> findByGroupId(long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the rooms where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rooms where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first room in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the first room in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the last room in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the last room in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the rooms before and after the current room in the ordered set where groupId = &#63;.
	 *
	 * @param roomId the primary key of the current room
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room
	 * @throws NoSuchRoomException if a room with the primary key could not be found
	 */
	public Room[] findByGroupId_PrevAndNext(
			long roomId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Removes all the rooms where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of rooms where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching rooms
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the rooms where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching rooms
	 */
	public java.util.List<Room> findByG_S(long groupId, boolean status);

	/**
	 * Returns a range of all the rooms where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of matching rooms
	 */
	public java.util.List<Room> findByG_S(
		long groupId, boolean status, int start, int end);

	/**
	 * Returns an ordered range of all the rooms where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findByG_S(
		long groupId, boolean status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rooms where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findByG_S(
		long groupId, boolean status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first room in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByG_S_First(
			long groupId, boolean status,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the first room in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByG_S_First(
		long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the last room in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByG_S_Last(
			long groupId, boolean status,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the last room in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByG_S_Last(
		long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the rooms before and after the current room in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param roomId the primary key of the current room
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room
	 * @throws NoSuchRoomException if a room with the primary key could not be found
	 */
	public Room[] findByG_S_PrevAndNext(
			long roomId, long groupId, boolean status,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Removes all the rooms where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, boolean status);

	/**
	 * Returns the number of rooms where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching rooms
	 */
	public int countByG_S(long groupId, boolean status);

	/**
	 * Caches the room in the entity cache if it is enabled.
	 *
	 * @param room the room
	 */
	public void cacheResult(Room room);

	/**
	 * Caches the rooms in the entity cache if it is enabled.
	 *
	 * @param rooms the rooms
	 */
	public void cacheResult(java.util.List<Room> rooms);

	/**
	 * Creates a new room with the primary key. Does not add the room to the database.
	 *
	 * @param roomId the primary key for the new room
	 * @return the new room
	 */
	public Room create(long roomId);

	/**
	 * Removes the room with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomId the primary key of the room
	 * @return the room that was removed
	 * @throws NoSuchRoomException if a room with the primary key could not be found
	 */
	public Room remove(long roomId) throws NoSuchRoomException;

	public Room updateImpl(Room room);

	/**
	 * Returns the room with the primary key or throws a <code>NoSuchRoomException</code> if it could not be found.
	 *
	 * @param roomId the primary key of the room
	 * @return the room
	 * @throws NoSuchRoomException if a room with the primary key could not be found
	 */
	public Room findByPrimaryKey(long roomId) throws NoSuchRoomException;

	/**
	 * Returns the room with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param roomId the primary key of the room
	 * @return the room, or <code>null</code> if a room with the primary key could not be found
	 */
	public Room fetchByPrimaryKey(long roomId);

	/**
	 * Returns all the rooms.
	 *
	 * @return the rooms
	 */
	public java.util.List<Room> findAll();

	/**
	 * Returns a range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of rooms
	 */
	public java.util.List<Room> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rooms
	 */
	public java.util.List<Room> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rooms
	 */
	public java.util.List<Room> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the rooms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of rooms.
	 *
	 * @return the number of rooms
	 */
	public int countAll();

}