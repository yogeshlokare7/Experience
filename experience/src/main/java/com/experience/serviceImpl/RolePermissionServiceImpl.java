package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.dao.RolePermissionDao;
import com.experience.entity.Rolepermission;
import com.experience.service.RolePermissionService;

/*
 * 
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService{

	@Autowired
	RolePermissionDao rolePermissionDao;
	
	
	public Integer saveRolepermission(Rolepermission rolepermission) throws Exception {
		return rolePermissionDao.saveRolepermission(rolepermission);
	}

	public Rolepermission updateRolepermission(Rolepermission rolepermission) throws Exception {
		return rolePermissionDao.updateRolepermission(rolepermission);
	}

	public void deleteRolepermission(Rolepermission rolepermission) throws Exception {
		rolePermissionDao.deleteRolepermission(rolepermission);
	}

	
	public Rolepermission getRolepermission(Integer rolepermissionId) throws Exception {
		return rolePermissionDao.getRolepermission(rolepermissionId);
	}

	
	public List<Rolepermission> getRolepermissionList()  throws Exception{
		return rolePermissionDao.getRolepermissionList();
	}


}
