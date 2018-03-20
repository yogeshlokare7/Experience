package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.InsuranceTypeDao;
import com.experience.entity.InsuranceType;
import com.experience.service.InsuranceTypeService;

@Service
public class InsuranceTypeServiceImpl implements InsuranceTypeService{
	
	@Autowired
	protected InsuranceTypeDao insuranceTypeDao;

	public Integer saveInsuranceType(InsuranceType insuranceType) throws Exception {
		return insuranceTypeDao.saveInsuranceType(insuranceType);
	}

	public InsuranceType updateInsuranceType(InsuranceType insuranceType) throws Exception {
		return insuranceTypeDao.updateInsuranceType(insuranceType);
	}

	public void deleteInsuranceType(InsuranceType insuranceType) throws Exception {
		insuranceTypeDao.deleteInsuranceType(insuranceType);
	}

	public InsuranceType getInsuranceType(Integer insuranceTypeId) throws Exception {
		return insuranceTypeDao.getInsuranceType(insuranceTypeId);
	}

	public List<InsuranceType> getInsuranceTypeList() throws Exception {
		return insuranceTypeDao.getInsuranceTypeList();
	}
}
