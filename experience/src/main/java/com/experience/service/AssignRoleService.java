package com.experience.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Assignrole;
 
@Service
public interface AssignRoleService {

	public Integer saveAssignrole(Assignrole Assignrole) throws Exception;

	public Assignrole updateAssignrole(Assignrole Assignrole) throws Exception;

	public void deleteAssignrole(Assignrole Assignrole) throws Exception;

	public Assignrole getAssignrole(Integer AssignroleId) throws Exception;

	public List<Assignrole> getAssignroleList() throws Exception;

}
