/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.acme.s5e6.service.persistence;

import com.acme.s5e6.model.S5E6Entry;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the s5e6 entry service. This utility wraps <code>com.acme.s5e6.service.persistence.impl.S5E6EntryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see S5E6EntryPersistence
 * @generated
 */
public class S5E6EntryUtil {

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
	public static void clearCache(S5E6Entry s5e6Entry) {
		getPersistence().clearCache(s5e6Entry);
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
	public static Map<Serializable, S5E6Entry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<S5E6Entry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<S5E6Entry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<S5E6Entry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<S5E6Entry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static S5E6Entry update(S5E6Entry s5e6Entry) {
		return getPersistence().update(s5e6Entry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static S5E6Entry update(
		S5E6Entry s5e6Entry, ServiceContext serviceContext) {

		return getPersistence().update(s5e6Entry, serviceContext);
	}

	/**
	 * Returns all the s5e6 entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching s5e6 entries
	 */
	public static List<S5E6Entry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the s5e6 entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>S5E6EntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of s5e6 entries
	 * @param end the upper bound of the range of s5e6 entries (not inclusive)
	 * @return the range of matching s5e6 entries
	 */
	public static List<S5E6Entry> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the s5e6 entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>S5E6EntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of s5e6 entries
	 * @param end the upper bound of the range of s5e6 entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s5e6 entries
	 */
	public static List<S5E6Entry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<S5E6Entry> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the s5e6 entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>S5E6EntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of s5e6 entries
	 * @param end the upper bound of the range of s5e6 entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching s5e6 entries
	 */
	public static List<S5E6Entry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<S5E6Entry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first s5e6 entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s5e6 entry
	 * @throws NoSuchEntryException if a matching s5e6 entry could not be found
	 */
	public static S5E6Entry findByUuid_First(
			String uuid, OrderByComparator<S5E6Entry> orderByComparator)
		throws com.acme.s5e6.exception.NoSuchEntryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first s5e6 entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s5e6 entry, or <code>null</code> if a matching s5e6 entry could not be found
	 */
	public static S5E6Entry fetchByUuid_First(
		String uuid, OrderByComparator<S5E6Entry> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last s5e6 entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s5e6 entry
	 * @throws NoSuchEntryException if a matching s5e6 entry could not be found
	 */
	public static S5E6Entry findByUuid_Last(
			String uuid, OrderByComparator<S5E6Entry> orderByComparator)
		throws com.acme.s5e6.exception.NoSuchEntryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last s5e6 entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s5e6 entry, or <code>null</code> if a matching s5e6 entry could not be found
	 */
	public static S5E6Entry fetchByUuid_Last(
		String uuid, OrderByComparator<S5E6Entry> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the s5e6 entries before and after the current s5e6 entry in the ordered set where uuid = &#63;.
	 *
	 * @param S5E6EntryId the primary key of the current s5e6 entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s5e6 entry
	 * @throws NoSuchEntryException if a s5e6 entry with the primary key could not be found
	 */
	public static S5E6Entry[] findByUuid_PrevAndNext(
			long S5E6EntryId, String uuid,
			OrderByComparator<S5E6Entry> orderByComparator)
		throws com.acme.s5e6.exception.NoSuchEntryException {

		return getPersistence().findByUuid_PrevAndNext(
			S5E6EntryId, uuid, orderByComparator);
	}

	/**
	 * Removes all the s5e6 entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of s5e6 entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching s5e6 entries
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the s5e6 entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching s5e6 entry
	 * @throws NoSuchEntryException if a matching s5e6 entry could not be found
	 */
	public static S5E6Entry findByUUID_G(String uuid, long groupId)
		throws com.acme.s5e6.exception.NoSuchEntryException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the s5e6 entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching s5e6 entry, or <code>null</code> if a matching s5e6 entry could not be found
	 */
	public static S5E6Entry fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the s5e6 entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching s5e6 entry, or <code>null</code> if a matching s5e6 entry could not be found
	 */
	public static S5E6Entry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the s5e6 entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the s5e6 entry that was removed
	 */
	public static S5E6Entry removeByUUID_G(String uuid, long groupId)
		throws com.acme.s5e6.exception.NoSuchEntryException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of s5e6 entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching s5e6 entries
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the s5e6 entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching s5e6 entries
	 */
	public static List<S5E6Entry> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the s5e6 entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>S5E6EntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s5e6 entries
	 * @param end the upper bound of the range of s5e6 entries (not inclusive)
	 * @return the range of matching s5e6 entries
	 */
	public static List<S5E6Entry> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the s5e6 entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>S5E6EntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s5e6 entries
	 * @param end the upper bound of the range of s5e6 entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s5e6 entries
	 */
	public static List<S5E6Entry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<S5E6Entry> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the s5e6 entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>S5E6EntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s5e6 entries
	 * @param end the upper bound of the range of s5e6 entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching s5e6 entries
	 */
	public static List<S5E6Entry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<S5E6Entry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first s5e6 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s5e6 entry
	 * @throws NoSuchEntryException if a matching s5e6 entry could not be found
	 */
	public static S5E6Entry findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<S5E6Entry> orderByComparator)
		throws com.acme.s5e6.exception.NoSuchEntryException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first s5e6 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s5e6 entry, or <code>null</code> if a matching s5e6 entry could not be found
	 */
	public static S5E6Entry fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<S5E6Entry> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last s5e6 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s5e6 entry
	 * @throws NoSuchEntryException if a matching s5e6 entry could not be found
	 */
	public static S5E6Entry findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<S5E6Entry> orderByComparator)
		throws com.acme.s5e6.exception.NoSuchEntryException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last s5e6 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s5e6 entry, or <code>null</code> if a matching s5e6 entry could not be found
	 */
	public static S5E6Entry fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<S5E6Entry> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the s5e6 entries before and after the current s5e6 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param S5E6EntryId the primary key of the current s5e6 entry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s5e6 entry
	 * @throws NoSuchEntryException if a s5e6 entry with the primary key could not be found
	 */
	public static S5E6Entry[] findByUuid_C_PrevAndNext(
			long S5E6EntryId, String uuid, long companyId,
			OrderByComparator<S5E6Entry> orderByComparator)
		throws com.acme.s5e6.exception.NoSuchEntryException {

		return getPersistence().findByUuid_C_PrevAndNext(
			S5E6EntryId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the s5e6 entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of s5e6 entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching s5e6 entries
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the s5e6 entry in the entity cache if it is enabled.
	 *
	 * @param s5e6Entry the s5e6 entry
	 */
	public static void cacheResult(S5E6Entry s5e6Entry) {
		getPersistence().cacheResult(s5e6Entry);
	}

	/**
	 * Caches the s5e6 entries in the entity cache if it is enabled.
	 *
	 * @param s5e6Entries the s5e6 entries
	 */
	public static void cacheResult(List<S5E6Entry> s5e6Entries) {
		getPersistence().cacheResult(s5e6Entries);
	}

	/**
	 * Creates a new s5e6 entry with the primary key. Does not add the s5e6 entry to the database.
	 *
	 * @param S5E6EntryId the primary key for the new s5e6 entry
	 * @return the new s5e6 entry
	 */
	public static S5E6Entry create(long S5E6EntryId) {
		return getPersistence().create(S5E6EntryId);
	}

	/**
	 * Removes the s5e6 entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param S5E6EntryId the primary key of the s5e6 entry
	 * @return the s5e6 entry that was removed
	 * @throws NoSuchEntryException if a s5e6 entry with the primary key could not be found
	 */
	public static S5E6Entry remove(long S5E6EntryId)
		throws com.acme.s5e6.exception.NoSuchEntryException {

		return getPersistence().remove(S5E6EntryId);
	}

	public static S5E6Entry updateImpl(S5E6Entry s5e6Entry) {
		return getPersistence().updateImpl(s5e6Entry);
	}

	/**
	 * Returns the s5e6 entry with the primary key or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param S5E6EntryId the primary key of the s5e6 entry
	 * @return the s5e6 entry
	 * @throws NoSuchEntryException if a s5e6 entry with the primary key could not be found
	 */
	public static S5E6Entry findByPrimaryKey(long S5E6EntryId)
		throws com.acme.s5e6.exception.NoSuchEntryException {

		return getPersistence().findByPrimaryKey(S5E6EntryId);
	}

	/**
	 * Returns the s5e6 entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param S5E6EntryId the primary key of the s5e6 entry
	 * @return the s5e6 entry, or <code>null</code> if a s5e6 entry with the primary key could not be found
	 */
	public static S5E6Entry fetchByPrimaryKey(long S5E6EntryId) {
		return getPersistence().fetchByPrimaryKey(S5E6EntryId);
	}

	/**
	 * Returns all the s5e6 entries.
	 *
	 * @return the s5e6 entries
	 */
	public static List<S5E6Entry> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the s5e6 entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>S5E6EntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of s5e6 entries
	 * @param end the upper bound of the range of s5e6 entries (not inclusive)
	 * @return the range of s5e6 entries
	 */
	public static List<S5E6Entry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the s5e6 entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>S5E6EntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of s5e6 entries
	 * @param end the upper bound of the range of s5e6 entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of s5e6 entries
	 */
	public static List<S5E6Entry> findAll(
		int start, int end, OrderByComparator<S5E6Entry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the s5e6 entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>S5E6EntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of s5e6 entries
	 * @param end the upper bound of the range of s5e6 entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of s5e6 entries
	 */
	public static List<S5E6Entry> findAll(
		int start, int end, OrderByComparator<S5E6Entry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the s5e6 entries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of s5e6 entries.
	 *
	 * @return the number of s5e6 entries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static S5E6EntryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<S5E6EntryPersistence, S5E6EntryPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(S5E6EntryPersistence.class);

		ServiceTracker<S5E6EntryPersistence, S5E6EntryPersistence>
			serviceTracker =
				new ServiceTracker<S5E6EntryPersistence, S5E6EntryPersistence>(
					bundle.getBundleContext(), S5E6EntryPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}