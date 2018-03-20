package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.SecurityPersonal;

@Service
public interface SecurityPersonalService {

	public Integer saveSecurityPersonal(SecurityPersonal securityPersonal) throws Exception;

	public SecurityPersonal updateSecurityPersonal(SecurityPersonal securityPersonal) throws Exception;

	public void deleteSecurityPersonal(SecurityPersonal securityPersonal) throws Exception;

	public SecurityPersonal getSecurityPersonal(Integer securityPersonalId) throws Exception;

	public List<SecurityPersonal> getSecurityPersonalList() throws Exception;
	
}
