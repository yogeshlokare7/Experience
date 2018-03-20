package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.MedicalDao;
import com.experience.entity.Medical;
import com.experience.service.MedicalService;

@Service
public class MedicalServiceImpl implements MedicalService{
	
	@Autowired
	protected MedicalDao medicalDao;

	public Integer saveMedical(Medical medical) throws Exception {
		return medicalDao.saveMedical(medical);
	}

	public Medical updateMedical(Medical medical) throws Exception {
		return medicalDao.updateMedical(medical);
	}

	public void deleteMedical(Medical medical) throws Exception {
		medicalDao.deleteMedical(medical);
	}

	public Medical getMedical(Integer medicalId) throws Exception {
		return medicalDao.getMedical(medicalId);
	}

	public List<Medical> getMedicalList() throws Exception {
		return medicalDao.getMedicalList();
	}
	
}
