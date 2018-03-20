package com.experience.dao;

import java.util.List;

import com.experience.entity.Medical;

public interface MedicalDao {

	public Integer saveMedical(Medical medical) throws Exception;

	public Medical updateMedical(Medical medical) throws Exception;

	public void deleteMedical(Medical medical) throws Exception;

	public Medical getMedical(Integer medicalId) throws Exception;

	public List<Medical> getMedicalList() throws Exception;
	
}
