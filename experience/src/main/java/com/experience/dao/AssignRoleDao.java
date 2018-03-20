package com.experience.dao;

import java.util.List;

import com.experience.entity.Assignrole;
 

public interface AssignRoleDao {

	public Integer saveAssignrole(Assignrole Assignrole) throws Exception;

	public Assignrole updateAssignrole(Assignrole Assignrole) throws Exception;

	public void deleteAssignrole(Assignrole Assignrole) throws Exception;

	public Assignrole getAssignrole(Integer AssignroleId) throws Exception;

	public List<Assignrole> getAssignroleList() throws Exception;

}
