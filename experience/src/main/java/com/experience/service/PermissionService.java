package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.UserPermission;

public interface PermissionService {
	
	public Integer savePermission(UserPermission permission) throws Exception;

	public UserPermission updatePermission(UserPermission permission) throws Exception;

	public void deletePermission(Integer permission) throws Exception;

	public UserPermission getPermission(Integer permissionId) throws Exception;

	public List<UserPermission> getPermissionList() throws Exception;
	
}
