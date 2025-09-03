/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link RoomLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RoomLocalService
 * @generated
 */
public class RoomLocalServiceWrapper
	implements RoomLocalService, ServiceWrapper<RoomLocalService> {

	public RoomLocalServiceWrapper() {
		this(null);
	}

	public RoomLocalServiceWrapper(RoomLocalService roomLocalService) {
		_roomLocalService = roomLocalService;
	}

	@Override
	public com.hotel.reservation.model.Room addRoom(
		long userId, String name, String description, String imageUrl,
		int maxGuests, java.math.BigDecimal dailyRate, String amenities,
		boolean status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _roomLocalService.addRoom(
			userId, name, description, imageUrl, maxGuests, dailyRate,
			amenities, status, serviceContext);
	}

	/**
	 * Adds the room to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RoomLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param room the room
	 * @return the room that was added
	 */
	@Override
	public com.hotel.reservation.model.Room addRoom(
		com.hotel.reservation.model.Room room) {

		return _roomLocalService.addRoom(room);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new room with the primary key. Does not add the room to the database.
	 *
	 * @param roomId the primary key for the new room
	 * @return the new room
	 */
	@Override
	public com.hotel.reservation.model.Room createRoom(long roomId) {
		return _roomLocalService.createRoom(roomId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the room with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RoomLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param roomId the primary key of the room
	 * @return the room that was removed
	 * @throws NoSuchRoomException
	 * @throws PortalException if a room with the primary key could not be found
	 */
	@Override
	public com.hotel.reservation.model.Room deleteRoom(long roomId)
		throws com.hotel.reservation.exception.NoSuchRoomException,
			   com.liferay.portal.kernel.exception.PortalException {

		return _roomLocalService.deleteRoom(roomId);
	}

	/**
	 * Deletes the room from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RoomLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param room the room
	 * @return the room that was removed
	 */
	@Override
	public com.hotel.reservation.model.Room deleteRoom(
		com.hotel.reservation.model.Room room) {

		return _roomLocalService.deleteRoom(room);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _roomLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _roomLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _roomLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _roomLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.hotel.reservation.model.impl.RoomModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _roomLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.hotel.reservation.model.impl.RoomModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _roomLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _roomLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _roomLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.hotel.reservation.model.Room fetchRoom(long roomId) {
		return _roomLocalService.fetchRoom(roomId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _roomLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _roomLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _roomLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the room with the primary key.
	 *
	 * @param roomId the primary key of the room
	 * @return the room
	 * @throws PortalException if a room with the primary key could not be found
	 */
	@Override
	public com.hotel.reservation.model.Room getRoom(long roomId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomLocalService.getRoom(roomId);
	}

	/**
	 * Returns a range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.hotel.reservation.model.impl.RoomModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of rooms
	 */
	@Override
	public java.util.List<com.hotel.reservation.model.Room> getRooms(
		int start, int end) {

		return _roomLocalService.getRooms(start, end);
	}

	@Override
	public java.util.List<com.hotel.reservation.model.Room> getRoomsByGroupId(
		long groupId) {

		return _roomLocalService.getRoomsByGroupId(groupId);
	}

	/**
	 * Returns the number of rooms.
	 *
	 * @return the number of rooms
	 */
	@Override
	public int getRoomsCount() {
		return _roomLocalService.getRoomsCount();
	}

	/**
	 * Updates the room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RoomLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param room the room
	 * @return the room that was updated
	 */
	@Override
	public com.hotel.reservation.model.Room updateRoom(
		com.hotel.reservation.model.Room room) {

		return _roomLocalService.updateRoom(room);
	}

	@Override
	public com.hotel.reservation.model.Room updateRoom(
			String name, String description, String imageUrl, int maxGuests,
			java.math.BigDecimal dailyRate, String amenities, boolean status,
			long roomId)
		throws com.hotel.reservation.exception.NoSuchRoomException {

		return _roomLocalService.updateRoom(
			name, description, imageUrl, maxGuests, dailyRate, amenities,
			status, roomId);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _roomLocalService.getBasePersistence();
	}

	@Override
	public RoomLocalService getWrappedService() {
		return _roomLocalService;
	}

	@Override
	public void setWrappedService(RoomLocalService roomLocalService) {
		_roomLocalService = roomLocalService;
	}

	private RoomLocalService _roomLocalService;

}