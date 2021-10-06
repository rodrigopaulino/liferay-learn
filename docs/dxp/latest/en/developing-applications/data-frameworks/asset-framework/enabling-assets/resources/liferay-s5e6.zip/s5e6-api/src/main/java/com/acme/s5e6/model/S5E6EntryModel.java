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

package com.acme.s5e6.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the S5E6Entry service. Represents a row in the &quot;S5E6_S5E6Entry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.acme.s5e6.model.impl.S5E6EntryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.acme.s5e6.model.impl.S5E6EntryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see S5E6Entry
 * @generated
 */
@ProviderType
public interface S5E6EntryModel
	extends BaseModel<S5E6Entry>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a s5e6 entry model instance should use the {@link S5E6Entry} interface instead.
	 */

	/**
	 * Returns the primary key of this s5e6 entry.
	 *
	 * @return the primary key of this s5e6 entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this s5e6 entry.
	 *
	 * @param primaryKey the primary key of this s5e6 entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this s5e6 entry.
	 *
	 * @return the uuid of this s5e6 entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this s5e6 entry.
	 *
	 * @param uuid the uuid of this s5e6 entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the s5e6 entry ID of this s5e6 entry.
	 *
	 * @return the s5e6 entry ID of this s5e6 entry
	 */
	public long getS5E6EntryId();

	/**
	 * Sets the s5e6 entry ID of this s5e6 entry.
	 *
	 * @param S5E6EntryId the s5e6 entry ID of this s5e6 entry
	 */
	public void setS5E6EntryId(long S5E6EntryId);

	/**
	 * Returns the group ID of this s5e6 entry.
	 *
	 * @return the group ID of this s5e6 entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this s5e6 entry.
	 *
	 * @param groupId the group ID of this s5e6 entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this s5e6 entry.
	 *
	 * @return the company ID of this s5e6 entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this s5e6 entry.
	 *
	 * @param companyId the company ID of this s5e6 entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this s5e6 entry.
	 *
	 * @return the user ID of this s5e6 entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this s5e6 entry.
	 *
	 * @param userId the user ID of this s5e6 entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this s5e6 entry.
	 *
	 * @return the user uuid of this s5e6 entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this s5e6 entry.
	 *
	 * @param userUuid the user uuid of this s5e6 entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this s5e6 entry.
	 *
	 * @return the user name of this s5e6 entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this s5e6 entry.
	 *
	 * @param userName the user name of this s5e6 entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this s5e6 entry.
	 *
	 * @return the create date of this s5e6 entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this s5e6 entry.
	 *
	 * @param createDate the create date of this s5e6 entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this s5e6 entry.
	 *
	 * @return the modified date of this s5e6 entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this s5e6 entry.
	 *
	 * @param modifiedDate the modified date of this s5e6 entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this s5e6 entry.
	 *
	 * @return the name of this s5e6 entry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this s5e6 entry.
	 *
	 * @param name the name of this s5e6 entry
	 */
	public void setName(String name);

}