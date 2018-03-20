package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.UserGroup;

@Service
public interface UserGroupService {

	public Integer saveUserGroup(UserGroup userGroup) throws Exception;

	public UserGroup updateUserGroup(UserGroup userGroup) throws Exception;

	public void deleteUserGroup(UserGroup userGroup) throws Exception;

	public UserGroup getUserGroup(Integer userGroupId) throws Exception;

	public List<UserGroup> getUserGroupList() throws Exception;
	
}
