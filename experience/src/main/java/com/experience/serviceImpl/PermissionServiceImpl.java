package com.experience.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.PermissionDao;
import com.experience.entity.UserPermission;
import com.experience.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService{

	@Autowired
	private PermissionDao permissionDao;
	
	public Integer savePermission(UserPermission permission) throws Exception {
		return permissionDao.savePermission(permission);
	}

	public UserPermission updatePermission(UserPermission permission) throws Exception {
		return permissionDao.updatePermission(permission);
	}

	public void deletePermission(Integer id) throws Exception {
		UserPermission permission = getPermission(id);
		if(permission!=null) {
			permissionDao.deletePermission(permission);
		}
	}

	public UserPermission getPermission(Integer permissionId) throws Exception {
		return permissionDao.getPermission(permissionId);
	}

	public List<UserPermission> getPermissionList() throws Exception {
		return permissionDao.getPermissionList();
	}

}
