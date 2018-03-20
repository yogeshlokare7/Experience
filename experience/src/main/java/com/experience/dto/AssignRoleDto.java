package com.experience.dto;

public class AssignRoleDto {

	private Integer id;
	private UserDto user;
	private RoleDto role;

	public AssignRoleDto() {
	}
	
	public AssignRoleDto(UserDto user, RoleDto role) {
		this.user = user;
		this.role = role;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserDto getUser() {
		return this.user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public RoleDto getRole() {
		return this.role;
	}

	public void setRole(RoleDto role) {
		this.role = role;
	}

}


