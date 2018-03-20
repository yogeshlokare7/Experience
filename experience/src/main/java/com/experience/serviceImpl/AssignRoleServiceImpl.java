package com.experience.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.AssignRoleDao;
import com.experience.entity.Assignrole;
import com.experience.service.AssignRoleService;



@Service
public class AssignRoleServiceImpl  implements AssignRoleService{

	@Autowired
	protected AssignRoleDao assignRoledao;

	public Integer saveAssignrole(Assignrole Assignrole) throws Exception {
		return assignRoledao.saveAssignrole(Assignrole);
	}

	public Assignrole updateAssignrole(Assignrole Assignrole) throws Exception {
		return assignRoledao.updateAssignrole(Assignrole);
	}

	public void deleteAssignrole(Assignrole Assignrole) throws Exception {
		assignRoledao.deleteAssignrole(Assignrole);
	}

	public Assignrole getAssignrole(Integer AssignroleId) throws Exception {
	return	assignRoledao.getAssignrole(AssignroleId);
	}

	public List<Assignrole> getAssignroleList() throws Exception {
		return assignRoledao.getAssignroleList();
	}

}
