/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.service.persistence.test;

import com.hotel.reservation.exception.NoSuchReservationException;
import com.hotel.reservation.model.Reservation;
import com.hotel.reservation.service.ReservationLocalServiceUtil;
import com.hotel.reservation.service.persistence.ReservationPersistence;
import com.hotel.reservation.service.persistence.ReservationUtil;

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
public class ReservationPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.hotel.reservation.service"));

	@Before
	public void setUp() {
		_persistence = ReservationUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Reservation> iterator = _reservations.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Reservation reservation = _persistence.create(pk);

		Assert.assertNotNull(reservation);

		Assert.assertEquals(reservation.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Reservation newReservation = addReservation();

		_persistence.remove(newReservation);

		Reservation existingReservation = _persistence.fetchByPrimaryKey(
			newReservation.getPrimaryKey());

		Assert.assertNull(existingReservation);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addReservation();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Reservation newReservation = _persistence.create(pk);

		newReservation.setGroupId(RandomTestUtil.nextLong());

		newReservation.setCompanyId(RandomTestUtil.nextLong());

		newReservation.setUserId(RandomTestUtil.nextLong());

		newReservation.setCreateDate(RandomTestUtil.nextDate());

		newReservation.setModifiedDate(RandomTestUtil.nextDate());

		newReservation.setRoomId(RandomTestUtil.nextLong());

		newReservation.setGuestName(RandomTestUtil.randomString());

		newReservation.setGuestEmail(RandomTestUtil.randomString());

		newReservation.setCheckInDate(RandomTestUtil.nextDate());

		newReservation.setCheckOutDate(RandomTestUtil.nextDate());

		newReservation.setTotalAmount(
			new BigDecimal(RandomTestUtil.nextDouble()));

		newReservation.setStatus(RandomTestUtil.nextInt());

		_reservations.add(_persistence.update(newReservation));

		Reservation existingReservation = _persistence.findByPrimaryKey(
			newReservation.getPrimaryKey());

		Assert.assertEquals(
			existingReservation.getReservationId(),
			newReservation.getReservationId());
		Assert.assertEquals(
			existingReservation.getGroupId(), newReservation.getGroupId());
		Assert.assertEquals(
			existingReservation.getCompanyId(), newReservation.getCompanyId());
		Assert.assertEquals(
			existingReservation.getUserId(), newReservation.getUserId());
		Assert.assertEquals(
			Time.getShortTimestamp(existingReservation.getCreateDate()),
			Time.getShortTimestamp(newReservation.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingReservation.getModifiedDate()),
			Time.getShortTimestamp(newReservation.getModifiedDate()));
		Assert.assertEquals(
			existingReservation.getRoomId(), newReservation.getRoomId());
		Assert.assertEquals(
			existingReservation.getGuestName(), newReservation.getGuestName());
		Assert.assertEquals(
			existingReservation.getGuestEmail(),
			newReservation.getGuestEmail());
		Assert.assertEquals(
			Time.getShortTimestamp(existingReservation.getCheckInDate()),
			Time.getShortTimestamp(newReservation.getCheckInDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingReservation.getCheckOutDate()),
			Time.getShortTimestamp(newReservation.getCheckOutDate()));
		Assert.assertEquals(
			existingReservation.getTotalAmount(),
			newReservation.getTotalAmount());
		Assert.assertEquals(
			existingReservation.getStatus(), newReservation.getStatus());
	}

	@Test
	public void testCountByGroupId() throws Exception {
		_persistence.countByGroupId(RandomTestUtil.nextLong());

		_persistence.countByGroupId(0L);
	}

	@Test
	public void testCountByRoomId() throws Exception {
		_persistence.countByRoomId(RandomTestUtil.nextLong());

		_persistence.countByRoomId(0L);
	}

	@Test
	public void testCountByG_S() throws Exception {
		_persistence.countByG_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByG_S(0L, 0);
	}

	@Test
	public void testCountByR_S() throws Exception {
		_persistence.countByR_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByR_S(0L, 0);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Reservation newReservation = addReservation();

		Reservation existingReservation = _persistence.findByPrimaryKey(
			newReservation.getPrimaryKey());

		Assert.assertEquals(existingReservation, newReservation);
	}

	@Test(expected = NoSuchReservationException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Reservation> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Reservation", "reservationId", true, "groupId", true, "companyId",
			true, "userId", true, "createDate", true, "modifiedDate", true,
			"roomId", true, "guestName", true, "guestEmail", true,
			"checkInDate", true, "checkOutDate", true, "totalAmount", true,
			"status", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Reservation newReservation = addReservation();

		Reservation existingReservation = _persistence.fetchByPrimaryKey(
			newReservation.getPrimaryKey());

		Assert.assertEquals(existingReservation, newReservation);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Reservation missingReservation = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingReservation);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Reservation newReservation1 = addReservation();
		Reservation newReservation2 = addReservation();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newReservation1.getPrimaryKey());
		primaryKeys.add(newReservation2.getPrimaryKey());

		Map<Serializable, Reservation> reservations =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, reservations.size());
		Assert.assertEquals(
			newReservation1, reservations.get(newReservation1.getPrimaryKey()));
		Assert.assertEquals(
			newReservation2, reservations.get(newReservation2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Reservation> reservations =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(reservations.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Reservation newReservation = addReservation();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newReservation.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Reservation> reservations =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, reservations.size());
		Assert.assertEquals(
			newReservation, reservations.get(newReservation.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Reservation> reservations =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(reservations.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Reservation newReservation = addReservation();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newReservation.getPrimaryKey());

		Map<Serializable, Reservation> reservations =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, reservations.size());
		Assert.assertEquals(
			newReservation, reservations.get(newReservation.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			ReservationLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Reservation>() {

				@Override
				public void performAction(Reservation reservation) {
					Assert.assertNotNull(reservation);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Reservation newReservation = addReservation();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Reservation.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"reservationId", newReservation.getReservationId()));

		List<Reservation> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		Reservation existingReservation = result.get(0);

		Assert.assertEquals(existingReservation, newReservation);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Reservation.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"reservationId", RandomTestUtil.nextLong()));

		List<Reservation> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Reservation newReservation = addReservation();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Reservation.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("reservationId"));

		Object newReservationId = newReservation.getReservationId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"reservationId", new Object[] {newReservationId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingReservationId = result.get(0);

		Assert.assertEquals(existingReservationId, newReservationId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Reservation.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("reservationId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"reservationId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Reservation addReservation() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Reservation reservation = _persistence.create(pk);

		reservation.setGroupId(RandomTestUtil.nextLong());

		reservation.setCompanyId(RandomTestUtil.nextLong());

		reservation.setUserId(RandomTestUtil.nextLong());

		reservation.setCreateDate(RandomTestUtil.nextDate());

		reservation.setModifiedDate(RandomTestUtil.nextDate());

		reservation.setRoomId(RandomTestUtil.nextLong());

		reservation.setGuestName(RandomTestUtil.randomString());

		reservation.setGuestEmail(RandomTestUtil.randomString());

		reservation.setCheckInDate(RandomTestUtil.nextDate());

		reservation.setCheckOutDate(RandomTestUtil.nextDate());

		reservation.setTotalAmount(new BigDecimal(RandomTestUtil.nextDouble()));

		reservation.setStatus(RandomTestUtil.nextInt());

		_reservations.add(_persistence.update(reservation));

		return reservation;
	}

	private List<Reservation> _reservations = new ArrayList<Reservation>();
	private ReservationPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}