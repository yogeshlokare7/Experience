package com.experience.dao;

import java.util.List;

import com.experience.entity.Candidate;

public interface CandidateDao {
	
	public Integer saveCandidate(Candidate candidate) throws Exception;

	public Candidate updateCandidate(Candidate candidate) throws Exception;

	public void deleteCandidate(Candidate candidate) throws Exception;

	public Candidate getCandidate(Integer candidateId) throws Exception;

	public List<Candidate> getCandidateList() throws Exception;
	
}
