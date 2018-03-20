package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.InsuranceType;

@Service
public interface InsuranceTypeService {

	public Integer saveInsuranceType(InsuranceType insuranceType) throws Exception;

	public InsuranceType updateInsuranceType(InsuranceType insuranceType) throws Exception;

	public void deleteInsuranceType(InsuranceType insuranceType) throws Exception;

	public InsuranceType getInsuranceType(Integer insuranceTypeId) throws Exception;

	public List<InsuranceType> getInsuranceTypeList() throws Exception;
	
}
