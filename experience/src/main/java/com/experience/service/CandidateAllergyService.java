package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.CandidateAllergy;

@Service
public interface CandidateAllergyService {

	public Integer saveCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception;

	public CandidateAllergy updateCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception;

	public void deleteCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception;

	public CandidateAllergy getCandidateAllergy(Integer candidateAllergyId) throws Exception;

	public List<CandidateAllergy> getCandidateAllergyList() throws Exception;
	
}
