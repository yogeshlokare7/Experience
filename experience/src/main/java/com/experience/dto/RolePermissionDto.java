package com.experience.dto;
import java.util.List;

import javax.persistence.Entity;

import com.experience.entity.Role;

@Entity
public class RolePermissionDto{

	private List<PermissionDto> permissionDtos;
	private Role role;
	
	
	public RolePermissionDto() {
	}
	
	public RolePermissionDto(List<PermissionDto> permissionDtos, Role role) {
		this.permissionDtos = permissionDtos;
		this.role = role;
	}
	
	public List<PermissionDto> getPermissionDtos() {
		return permissionDtos;
	}
	public void setPermissionDtos(List<PermissionDto> permissionDtos) {
		this.permissionDtos = permissionDtos;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}


