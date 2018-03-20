package com.experience.dao;

import java.util.List;

import com.experience.entity.CandidateAllergy;

public interface CandidateAllergyDao {
	
	public Integer saveCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception;

	public CandidateAllergy updateCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception;

	public void deleteCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception;

	public CandidateAllergy getCandidateAllergy(Integer candidateAllergyId) throws Exception;

	public List<CandidateAllergy> getCandidateAllergyList() throws Exception;
}
