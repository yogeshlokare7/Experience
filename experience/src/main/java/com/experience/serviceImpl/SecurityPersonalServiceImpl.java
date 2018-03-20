package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.SecurityPersonalDao;
import com.experience.entity.SecurityPersonal;
import com.experience.service.SecurityPersonalService;

@Repository
public class SecurityPersonalServiceImpl implements SecurityPersonalService{

	
	@Autowired
	protected SecurityPersonalDao securityPersonalDao;

	public Integer saveSecurityPersonal(SecurityPersonal securityPersonal) throws Exception {
		return securityPersonalDao.saveSecurityPersonal(securityPersonal);
	}

	public SecurityPersonal updateSecurityPersonal(SecurityPersonal securityPersonal) throws Exception {
		return securityPersonalDao.updateSecurityPersonal(securityPersonal);
	}

	public void deleteSecurityPersonal(SecurityPersonal securityPersonal) throws Exception {
		securityPersonalDao.deleteSecurityPersonal(securityPersonal);
	}

	public SecurityPersonal getSecurityPersonal(Integer securityPersonalId) throws Exception {
		return securityPersonalDao.getSecurityPersonal(securityPersonalId);
	}

	public List<SecurityPersonal> getSecurityPersonalList() throws Exception {
		return securityPersonalDao.getSecurityPersonalList();
	}
	
	
}
