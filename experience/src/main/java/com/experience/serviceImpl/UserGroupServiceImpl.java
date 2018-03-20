package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.UserGroupDao;
import com.experience.entity.UserGroup;
import com.experience.service.UserGroupService;

@Service
public class UserGroupServiceImpl implements UserGroupService{

	@Autowired
	protected UserGroupDao userGroupDao;

	public Integer saveUserGroup(UserGroup userGroup) throws Exception {
		return userGroupDao.saveUserGroup(userGroup);
	}

	public UserGroup updateUserGroup(UserGroup userGroup) throws Exception {
		return userGroupDao.updateUserGroup(userGroup);
	}

	public void deleteUserGroup(UserGroup userGroup) throws Exception {
		userGroupDao.deleteUserGroup(userGroup);
	}

	public UserGroup getUserGroup(Integer userGroupId) throws Exception {
		return userGroupDao.getUserGroup(userGroupId);
	}

	public List<UserGroup> getUserGroupList() throws Exception {
		return userGroupDao.getUserGroupList();
	}
	
	

}
