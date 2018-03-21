package com.experience.daoImpl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.PermissionDao;
import com.experience.entity.UserPermission;

@Repository
public class PermissionDaoImpl extends EntityTransactionImpl<UserPermission> implements PermissionDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer savePermission(UserPermission permission) throws Exception {
		return saveEntity(permission, sessionFactory);
	}

	public UserPermission updatePermission(UserPermission permission) throws Exception {
		return updateEntity(permission, sessionFactory);
	}

	public void deletePermission(UserPermission permission) throws Exception {
		deleteEntity(permission, sessionFactory);
	}

	public UserPermission getPermission(Integer permissionId) throws Exception {
		return getEntity(new UserPermission(), permissionId, sessionFactory);
	}

	public List<UserPermission> getPermissionList() throws Exception {
		return getEntityList(new UserPermission(), sessionFactory);
	}

}
