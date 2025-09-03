/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.service.persistence.test;

import com.hotel.reservation.exception.NoSuchRoomException;
import com.hotel.reservation.model.Room;
import com.hotel.reservation.service.RoomLocalServiceUtil;
import com.hotel.reservation.service.persistence.RoomPersistence;
import com.hotel.reservation.service.persistence.RoomUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class RoomPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.hotel.reservation.service"));

	@Before
	public void setUp() {
		_persistence = RoomUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Room> iterator = _rooms.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Room room = _persistence.create(pk);

		Assert.assertNotNull(room);

		Assert.assertEquals(room.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Room newRoom = addRoom();

		_persistence.remove(newRoom);

		Room existingRoom = _persistence.fetchByPrimaryKey(
			newRoom.getPrimaryKey());

		Assert.assertNull(existingRoom);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addRoom();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Room newRoom = _persistence.create(pk);

		newRoom.setGroupId(RandomTestUtil.nextLong());

		newRoom.setCompanyId(RandomTestUtil.nextLong());

		newRoom.setUserId(RandomTestUtil.nextLong());

		newRoom.setCreateDate(RandomTestUtil.nextDate());

		newRoom.setModifiedDate(RandomTestUtil.nextDate());

		newRoom.setName(RandomTestUtil.randomString());

		newRoom.setDescription(RandomTestUtil.randomString());

		newRoom.setImageUrl(RandomTestUtil.nextLong());

		newRoom.setMaxGuests(RandomTestUtil.nextInt());

		newRoom.setDailyRate(new BigDecimal(RandomTestUtil.nextDouble()));

		newRoom.setAmenities(RandomTestUtil.randomString());

		newRoom.setStatus(RandomTestUtil.randomBoolean());

		_rooms.add(_persistence.update(newRoom));

		Room existingRoom = _persistence.findByPrimaryKey(
			newRoom.getPrimaryKey());

		Assert.assertEquals(existingRoom.getRoomId(), newRoom.getRoomId());
		Assert.assertEquals(existingRoom.getGroupId(), newRoom.getGroupId());
		Assert.assertEquals(
			existingRoom.getCompanyId(), newRoom.getCompanyId());
		Assert.assertEquals(existingRoom.getUserId(), newRoom.getUserId());
		Assert.assertEquals(
			Time.getShortTimestamp(existingRoom.getCreateDate()),
			Time.getShortTimestamp(newRoom.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingRoom.getModifiedDate()),
			Time.getShortTimestamp(newRoom.getModifiedDate()));
		Assert.assertEquals(existingRoom.getName(), newRoom.getName());
		Assert.assertEquals(
			existingRoom.getDescription(), newRoom.getDescription());
		Assert.assertEquals(existingRoom.getImageUrl(), newRoom.getImageUrl());
		Assert.assertEquals(
			existingRoom.getMaxGuests(), newRoom.getMaxGuests());
		Assert.assertEquals(
			existingRoom.getDailyRate(), newRoom.getDailyRate());
		Assert.assertEquals(
			existingRoom.getAmenities(), newRoom.getAmenities());
		Assert.assertEquals(existingRoom.isStatus(), newRoom.isStatus());
	}

	@Test
	public void testCountByGroupId() throws Exception {
		_persistence.countByGroupId(RandomTestUtil.nextLong());

		_persistence.countByGroupId(0L);
	}

	@Test
	public void testCountByG_S() throws Exception {
		_persistence.countByG_S(
			RandomTestUtil.nextLong(), RandomTestUtil.randomBoolean());

		_persistence.countByG_S(0L, RandomTestUtil.randomBoolean());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Room newRoom = addRoom();

		Room existingRoom = _persistence.findByPrimaryKey(
			newRoom.getPrimaryKey());

		Assert.assertEquals(existingRoom, newRoom);
	}

	@Test(expected = NoSuchRoomException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Room> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Room", "roomId", true, "groupId", true, "companyId", true,
			"userId", true, "createDate", true, "modifiedDate", true, "name",
			true, "description", true, "imageUrl", true, "maxGuests", true,
			"dailyRate", true, "amenities", true, "status", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Room newRoom = addRoom();

		Room existingRoom = _persistence.fetchByPrimaryKey(
			newRoom.getPrimaryKey());

		Assert.assertEquals(existingRoom, newRoom);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Room missingRoom = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingRoom);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Room newRoom1 = addRoom();
		Room newRoom2 = addRoom();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRoom1.getPrimaryKey());
		primaryKeys.add(newRoom2.getPrimaryKey());

		Map<Serializable, Room> rooms = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, rooms.size());
		Assert.assertEquals(newRoom1, rooms.get(newRoom1.getPrimaryKey()));
		Assert.assertEquals(newRoom2, rooms.get(newRoom2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Room> rooms = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(rooms.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Room newRoom = addRoom();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRoom.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Room> rooms = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, rooms.size());
		Assert.assertEquals(newRoom, rooms.get(newRoom.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Room> rooms = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(rooms.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Room newRoom = addRoom();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRoom.getPrimaryKey());

		Map<Serializable, Room> rooms = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, rooms.size());
		Assert.assertEquals(newRoom, rooms.get(newRoom.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			RoomLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Room>() {

				@Override
				public void performAction(Room room) {
					Assert.assertNotNull(room);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Room newRoom = addRoom();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Room.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("roomId", newRoom.getRoomId()));

		List<Room> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Room existingRoom = result.get(0);

		Assert.assertEquals(existingRoom, newRoom);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Room.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("roomId", RandomTestUtil.nextLong()));

		List<Room> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Room newRoom = addRoom();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Room.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("roomId"));

		Object newRoomId = newRoom.getRoomId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("roomId", new Object[] {newRoomId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingRoomId = result.get(0);

		Assert.assertEquals(existingRoomId, newRoomId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Room.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("roomId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"roomId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Room addRoom() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Room room = _persistence.create(pk);

		room.setGroupId(RandomTestUtil.nextLong());

		room.setCompanyId(RandomTestUtil.nextLong());

		room.setUserId(RandomTestUtil.nextLong());

		room.setCreateDate(RandomTestUtil.nextDate());

		room.setModifiedDate(RandomTestUtil.nextDate());

		room.setName(RandomTestUtil.randomString());

		room.setDescription(RandomTestUtil.randomString());

		room.setImageUrl(RandomTestUtil.nextLong());

		room.setMaxGuests(RandomTestUtil.nextInt());

		room.setDailyRate(new BigDecimal(RandomTestUtil.nextDouble()));

		room.setAmenities(RandomTestUtil.randomString());

		room.setStatus(RandomTestUtil.randomBoolean());

		_rooms.add(_persistence.update(room));

		return room;
	}

	private List<Room> _rooms = new ArrayList<Room>();
	private RoomPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}