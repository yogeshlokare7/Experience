package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Permission;

public interface PermissionService {
	
	public Integer savePermission(Permission permission) throws Exception;

	public Permission updatePermission(Permission permission) throws Exception;

	public void deletePermission(Integer permission) throws Exception;

	public Permission getPermission(Integer permissionId) throws Exception;

	public List<Permission> getPermissionList() throws Exception;
	
}
