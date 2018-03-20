package com.experience.dao;

import java.util.List;

import com.experience.entity.Permission;

public interface PermissionDao {
	
	public Integer savePermission(Permission permission) throws Exception;

	public Permission updatePermission(Permission permission) throws Exception;

	public void deletePermission(Permission permission) throws Exception;

	public Permission getPermission(Integer permissionId) throws Exception;

	public List<Permission> getPermissionList() throws Exception;
	
}
