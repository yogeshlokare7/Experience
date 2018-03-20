package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Insurance;

@Service
public interface InsuranceService {
	
	public Integer saveInsurance(Insurance insurance) throws Exception;

	public Insurance updateInsurance(Insurance insurance) throws Exception;

	public void deleteInsurance(Insurance insurance) throws Exception;

	public Insurance getInsurance(Integer insuranceId) throws Exception;

	public List<Insurance> getInsuranceList() throws Exception;
	
}
