package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.InsuranceDao;
import com.experience.entity.Insurance;
import com.experience.service.InsuranceService;

@Service
public class InsuranceServiceImpl extends EntityTransactionServiceImpl<Insurance> implements InsuranceService{
	
	@Autowired
	protected InsuranceDao insuranceDao;

	public Integer saveInsurance(Insurance insurance) throws Exception {
		return insuranceDao.saveInsurance(insurance);
	}

	public Insurance updateInsurance(Insurance insurance) throws Exception {
		return insuranceDao.updateInsurance(insurance);
	}

	public void deleteInsurance(Insurance insurance) throws Exception {
		insuranceDao.deleteInsurance(insurance);
	}

	public Insurance getInsurance(Integer insuranceId) throws Exception {
		return insuranceDao.getInsurance(insuranceId);
	}

	public List<Insurance> getInsuranceList() throws Exception {
		return insuranceDao.getInsuranceList();
	}
	
}
