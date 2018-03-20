package com.experience.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.RoleDao;
import com.experience.entity.Role;
import com.experience.service.RoleService;

@Repository
public class RoleServiceImpl implements RoleService{


	Role role = new Role();
	
	@Autowired
	private RoleDao roleDao;
	
	public Integer saveRole(Role role) throws Exception {
		return roleDao.saveRole(role);
	}

	public Role updateRole(Role role) throws Exception {
		return roleDao.updateRole(role);
	}

	public void deleteRole(Integer id) throws Exception {
		Role role = getRole(id);
		if(role!=null) {
			roleDao.deleteRole(role);
		}
	}

	public Role getRole(Integer roleId) throws Exception {
		return roleDao.getRole(roleId);
	}

	public List<Role> getRoleList() throws Exception {
		return roleDao.getRoleList();
	}

}
