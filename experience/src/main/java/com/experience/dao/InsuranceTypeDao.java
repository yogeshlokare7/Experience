package com.experience.dao;

import java.util.List;

import com.experience.entity.InsuranceType;

public interface InsuranceTypeDao {
	
	public Integer saveInsuranceType(InsuranceType insuranceType) throws Exception;

	public InsuranceType updateInsuranceType(InsuranceType insuranceType) throws Exception;

	public void deleteInsuranceType(InsuranceType insuranceType) throws Exception;

	public InsuranceType getInsuranceType(Integer insuranceTypeId) throws Exception;

	public List<InsuranceType> getInsuranceTypeList() throws Exception;
	
}
