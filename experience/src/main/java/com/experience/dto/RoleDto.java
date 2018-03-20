package com.experience.dto;
import java.util.HashSet;
import java.util.Set;

public class RoleDto  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer role;
	private Set<AssignRoleDto> assignroles = new HashSet<AssignRoleDto>(0);
	private Set<RolePermissionDto> rolepermissions = new HashSet<RolePermissionDto>(0);

	public RoleDto() {
	}

	public RoleDto(Integer role, Set<AssignRoleDto> assignroles, Set<RolePermissionDto> rolepermissions) {
		this.role = role;
		this.assignroles = assignroles;
		this.rolepermissions = rolepermissions;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Set<AssignRoleDto> getAssignroles() {
		return this.assignroles;
	}

	public void setAssignroles(Set<AssignRoleDto> assignroles) {
		this.assignroles = assignroles;
	}

	public Set<RolePermissionDto> getRolepermissions() {
		return this.rolepermissions;
	}

	public void setRolepermissions(Set<RolePermissionDto> rolepermissions) {
		this.rolepermissions = rolepermissions;
	}

}


