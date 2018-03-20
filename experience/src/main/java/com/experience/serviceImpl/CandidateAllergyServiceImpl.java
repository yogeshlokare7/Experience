package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.CandidateAllergyDao;
import com.experience.entity.CandidateAllergy;
import com.experience.service.CandidateAllergyService;

@Service
public class CandidateAllergyServiceImpl  implements CandidateAllergyService{

	@Autowired
	protected CandidateAllergyDao candidateAllergyDao;

	public Integer saveCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception {
		return candidateAllergyDao.saveCandidateAllergy(candidateAllergy);
	}

	public CandidateAllergy updateCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception {
		return candidateAllergyDao.updateCandidateAllergy(candidateAllergy);
	}

	public void deleteCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception {
		candidateAllergyDao.deleteCandidateAllergy(candidateAllergy);
	}

	public CandidateAllergy getCandidateAllergy(Integer candidateAllergyId) throws Exception {
		return candidateAllergyDao.getCandidateAllergy(candidateAllergyId);
	}

	public List<CandidateAllergy> getCandidateAllergyList() throws Exception {
		return candidateAllergyDao.getCandidateAllergyList();
	}


}
