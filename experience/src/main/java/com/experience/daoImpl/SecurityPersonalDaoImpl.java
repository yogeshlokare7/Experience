package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.SecurityPersonalDao;
import com.experience.entity.SecurityPersonal;

@Repository
public class SecurityPersonalDaoImpl extends EntityTransactionImpl<SecurityPersonal> implements SecurityPersonalDao {

	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveSecurityPersonal(SecurityPersonal securityPersonal) throws Exception {
		return saveEntity(securityPersonal, sessionFactory);
	}

	public SecurityPersonal updateSecurityPersonal(SecurityPersonal securityPersonal) throws Exception {
		return updateEntity(securityPersonal, sessionFactory);
	}

	public void deleteSecurityPersonal(SecurityPersonal securityPersonal) throws Exception {
		deleteEntity(securityPersonal, sessionFactory);
	}

	public SecurityPersonal getSecurityPersonal(Integer securityPersonalId) throws Exception {
		return getEntity(new SecurityPersonal(), securityPersonalId, sessionFactory);
	}

	public List<SecurityPersonal> getSecurityPersonalList() throws Exception {
		return getEntityList(new SecurityPersonal(), sessionFactory);
	}
	
	
}
