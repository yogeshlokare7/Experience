package com.experience.daoImpl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.AssignRoleDao;
import com.experience.entity.Assignrole;



@Repository
public class AssignRoleDaoImpl extends EntityTransactionImpl<Assignrole> implements AssignRoleDao{

	@Autowired
	private SessionFactory sessionFactory;

	public Integer saveAssignrole(Assignrole Assignrole) throws Exception {
		return saveEntity(Assignrole, sessionFactory);
	}

	public Assignrole updateAssignrole(Assignrole Assignrole) throws Exception {
		return updateEntity(Assignrole, sessionFactory);
	}

	public void deleteAssignrole(Assignrole Assignrole) throws Exception {
		deleteEntity(Assignrole, sessionFactory);
	}

	public Assignrole getAssignrole(Integer AssignroleId) throws Exception {
		return getEntity(new Assignrole(), AssignroleId, sessionFactory);
	}

	public List<Assignrole> getAssignroleList() throws Exception {
		return getEntityList(new Assignrole(), sessionFactory);
	}

}
