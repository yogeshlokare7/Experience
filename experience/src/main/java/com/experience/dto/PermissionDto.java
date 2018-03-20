package com.experience.dto;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class PermissionDto  {

	private Integer id;
	private String name;
	private Set<RolePermissionDto> rolepermissions = new HashSet<RolePermissionDto>(0);

	public PermissionDto() {
	}

	public PermissionDto(String name, Set<RolePermissionDto> rolepermissions) {
		this.name = name;
		this.rolepermissions = rolepermissions;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<RolePermissionDto> getRolepermissions() {
		return this.rolepermissions;
	}

	public void setRolepermissions(Set<RolePermissionDto> rolepermissions) {
		this.rolepermissions = rolepermissions;
	}

}


