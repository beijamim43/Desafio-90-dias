/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hotel.reservation.service.impl;

import com.hotel.reservation.exception.NoSuchRoomException;
import com.hotel.reservation.model.Room;
import com.hotel.reservation.service.base.RoomLocalServiceBaseImpl;


import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.hotel.reservation.model.Room",
	service = AopService.class
)
public class RoomLocalServiceImpl extends RoomLocalServiceBaseImpl {

    @Override
    public Room addRoom(long userId, String name, String description, String imageUrl, int maxGuests, BigDecimal dailyRate, String amenities, boolean status, ServiceContext serviceContext) {
        long groupId = serviceContext.getScopeGroupId();
        long companyId = serviceContext.getCompanyId();
        Room quarto = roomPersistence.create(counterLocalService.increment());

        quarto.setGroupId(groupId);
        quarto.setCompanyId(companyId);
        quarto.setUserId(userId);
        quarto.setCreateDate(new Date());
        quarto.setModifiedDate(new Date());

        quarto.setName(name);
        quarto.setDescription(description);
        quarto.setImageUrl(imageUrl);
        quarto.setMaxGuests(maxGuests);
        quarto.setDailyRate(dailyRate);
        quarto.setAmenities(amenities);
        quarto.setStatus(status);

        return roomPersistence.update(quarto);
    }

    @Override
    public Room updateRoom(String name, String description, String imageUrl, int maxGuests, BigDecimal dailyRate, String amenities, boolean status, long roomId)
                            throws NoSuchRoomException {
        Room quarto = roomPersistence.findByPrimaryKey(roomId);

        quarto.setName(name);
        quarto.setDescription(description);
        quarto.setImageUrl(imageUrl);
        quarto.setMaxGuests(maxGuests);
        quarto.setDailyRate(dailyRate);
        quarto.setAmenities(amenities);
        quarto.setStatus(status);
        quarto.setModifiedDate(new Date());

        return roomPersistence.update(quarto);
    }

    @Override
    public List<Room> getRoomsByGroupId(long groupId) {
        return roomPersistence.findByGroupId(groupId);
    }

    @Override
    public Room deleteRoom(long roomId) throws NoSuchRoomException {
        Room quarto = roomPersistence.findByPrimaryKey(roomId);
        return roomPersistence.remove(quarto);
    }


}