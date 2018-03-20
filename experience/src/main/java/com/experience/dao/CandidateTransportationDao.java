package com.experience.dao;

import java.util.List;

import com.experience.entity.CandidateTransportation;

public interface CandidateTransportationDao {

	public Integer saveCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception;

	public CandidateTransportation updateCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception;

	public void deleteCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception;

	public CandidateTransportation getCandidateTransportation(Integer candidateTransportationId) throws Exception;

	public List<CandidateTransportation> getCandidateTransportationList() throws Exception;
	
}
