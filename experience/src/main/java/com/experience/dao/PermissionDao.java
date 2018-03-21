package com.experience.dao;

import java.util.List;

import com.experience.entity.UserPermission;

public interface PermissionDao {
	
	public Integer savePermission(UserPermission permission) throws Exception;

	public UserPermission updatePermission(UserPermission permission) throws Exception;

	public void deletePermission(UserPermission permission) throws Exception;

	public UserPermission getPermission(Integer permissionId) throws Exception;

	public List<UserPermission> getPermissionList() throws Exception;
	
}
