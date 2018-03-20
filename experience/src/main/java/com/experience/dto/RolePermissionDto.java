package com.experience.dto;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RolePermissionDto{

	private Integer id;
	private PermissionDto permission;
	private RoleDto role;

	public RolePermissionDto() {
	}

	public RolePermissionDto(PermissionDto permission, RoleDto role) {
		this.permission = permission;
		this.role = role;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PermissionDto getPermission() {
		return this.permission;
	}

	public void setPermission(PermissionDto permission) {
		this.permission = permission;
	}

	public RoleDto getRole() {
		return this.role;
	}

	public void setRole(RoleDto role) {
		this.role = role;
	}
}


