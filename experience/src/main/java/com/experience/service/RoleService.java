package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Role;

@Service
public interface RoleService {

	public Integer saveRole(Role role) throws Exception;

	public Role updateRole(Role role)  throws Exception;

	public void deleteRole(Integer role)  throws Exception;

	public Role getRole(Integer roleId)  throws Exception;

	public List<Role> getRoleList()  throws Exception;
}
