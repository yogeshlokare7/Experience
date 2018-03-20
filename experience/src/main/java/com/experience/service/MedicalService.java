package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Medical;

@Service
public interface MedicalService {
	
	public Integer saveMedical(Medical medical) throws Exception;

	public Medical updateMedical(Medical medical) throws Exception;

	public void deleteMedical(Medical medical) throws Exception;

	public Medical getMedical(Integer medicalId) throws Exception;

	public List<Medical> getMedicalList() throws Exception;
	
}
