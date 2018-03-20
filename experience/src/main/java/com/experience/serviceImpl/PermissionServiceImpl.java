package com.experience.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.PermissionDao;
import com.experience.entity.Permission;
import com.experience.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService{

	@Autowired
	private PermissionDao permissionDao;
	
	public Integer savePermission(Permission permission) throws Exception {
		return permissionDao.savePermission(permission);
	}

	public Permission updatePermission(Permission permission) throws Exception {
		return permissionDao.updatePermission(permission);
	}

	public void deletePermission(Integer id) throws Exception {
		Permission permission = getPermission(id);
		if(permission!=null) {
			permissionDao.deletePermission(permission);
		}
	}

	public Permission getPermission(Integer permissionId) throws Exception {
		return permissionDao.getPermission(permissionId);
	}

	public List<Permission> getPermissionList() throws Exception {
		return permissionDao.getPermissionList();
	}

}
