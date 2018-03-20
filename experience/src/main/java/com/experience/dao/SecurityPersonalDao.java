package com.experience.dao;

import java.util.List;

import com.experience.entity.SecurityPersonal;

public interface SecurityPersonalDao {

	
	public Integer saveSecurityPersonal(SecurityPersonal securityPersonal) throws Exception;

	public SecurityPersonal updateSecurityPersonal(SecurityPersonal securityPersonal) throws Exception;

	public void deleteSecurityPersonal(SecurityPersonal securityPersonal) throws Exception;

	public SecurityPersonal getSecurityPersonal(Integer securityPersonalId) throws Exception;

	public List<SecurityPersonal> getSecurityPersonalList() throws Exception;
	
}
