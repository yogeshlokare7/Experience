package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.CandidateTransportation;

@Service
public interface CandidateTransportationService {

	public Integer saveCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception;

	public CandidateTransportation updateCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception;

	public void deleteCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception;

	public CandidateTransportation getCandidateTransportation(Integer candidateTransportationId) throws Exception;

	public List<CandidateTransportation> getCandidateTransportationList() throws Exception;
	
}
