package com.experience.daoImpl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.PermissionDao;
import com.experience.entity.Permission;

@Repository
public class PermissionDaoImpl extends EntityTransactionImpl<Permission> implements PermissionDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer savePermission(Permission permission) throws Exception {
		return saveEntity(permission, sessionFactory);
	}

	public Permission updatePermission(Permission permission) throws Exception {
		return updateEntity(permission, sessionFactory);
	}

	public void deletePermission(Permission permission) throws Exception {
		deleteEntity(permission, sessionFactory);
	}

	public Permission getPermission(Integer permissionId) throws Exception {
		return getEntity(new Permission(), permissionId, sessionFactory);
	}

	public List<Permission> getPermissionList() throws Exception {
		return getEntityList(new Permission(), sessionFactory);
	}

}
