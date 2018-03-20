package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.CandidateDao;
import com.experience.entity.Candidate;
import com.experience.service.CandidateService;

@Service
public class CandidateServiceImpl  implements CandidateService{
	
	@Autowired
	protected CandidateDao candidateDao;

	public Integer saveCandidate(Candidate candidate) throws Exception {
		return candidateDao.saveCandidate(candidate);
	}

	public Candidate updateCandidate(Candidate candidate) throws Exception {
		return candidateDao.updateCandidate(candidate);
	}

	public void deleteCandidate(Candidate candidate) throws Exception {
		candidateDao.deleteCandidate(candidate);
	}

	public Candidate getCandidate(Integer candidateId) throws Exception {
		return candidateDao.getCandidate(candidateId);
	}

	public List<Candidate> getCandidateList() throws Exception {
		return candidateDao.getCandidateList();
	}
	
	
}
