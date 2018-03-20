package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Candidate;

@Service
public interface CandidateService {
	
	public Integer saveCandidate(Candidate candidate) throws Exception;

	public Candidate updateCandidate(Candidate candidate) throws Exception;

	public void deleteCandidate(Candidate candidate) throws Exception;

	public Candidate getCandidate(Integer candidateId) throws Exception;

	public List<Candidate> getCandidateList() throws Exception;
	
}
