package com.experience.dao;

import java.util.List;

import com.experience.entity.UserGroup;

public interface UserGroupDao {
	
	public Integer saveUserGroup(UserGroup userGroup) throws Exception;

	public UserGroup updateUserGroup(UserGroup userGroup) throws Exception;

	public void deleteUserGroup(UserGroup userGroup) throws Exception;

	public UserGroup getUserGroup(Integer userGroupId) throws Exception;

	public List<UserGroup> getUserGroupList() throws Exception;
	
}
