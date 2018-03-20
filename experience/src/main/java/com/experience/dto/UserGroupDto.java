package com.experience.dto;

import com.experience.entity.UserGroup;

public class UserGroupDto {
	
	Integer userGroupId;
	String  name;
	String details;
	
public UserGroupDto() {
		
	}
	
	public UserGroupDto(UserGroup usergroup) {
		setUserGroupId(usergroup.getUserGroupId());
		setName(usergroup.getName());
		setDetails(usergroup.getDetails());
		
	}
	public UserGroup  getEntityFromDTO() {
		UserGroup usergroup= new UserGroup();
		usergroup.setUserGroupId(getUserGroupId());
		usergroup.setName(getName());
		usergroup.setDetails(getDetails());
		
		return usergroup;
	}
	
	public Integer getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(Integer userGroupId) {
		this.userGroupId = userGroupId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
}
