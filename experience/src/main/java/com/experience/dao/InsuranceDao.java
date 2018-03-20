package com.experience.dao;

import java.util.List;

import com.experience.entity.Insurance;

public interface InsuranceDao {
	
	public Integer saveInsurance(Insurance insurance) throws Exception;

	public Insurance updateInsurance(Insurance insurance) throws Exception;

	public void deleteInsurance(Insurance insurance) throws Exception;

	public Insurance getInsurance(Integer insuranceId) throws Exception;

	public List<Insurance> getInsuranceList() throws Exception;
	
}
