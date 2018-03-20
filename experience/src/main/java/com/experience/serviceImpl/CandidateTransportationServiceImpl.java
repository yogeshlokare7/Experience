package com.experience.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.CandidateTransportationDao;
import com.experience.entity.CandidateTransportation;
import com.experience.service.CandidateTransportationService;

@Service
public class CandidateTransportationServiceImpl implements CandidateTransportationService{

	@Autowired
	protected CandidateTransportationDao candidateTransportationDao;

	public Integer saveCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception {
		return candidateTransportationDao.saveCandidateTransportation(candidateTransportation);
	}

	public CandidateTransportation updateCandidateTransportation(CandidateTransportation candidateTransportation)throws Exception {
		return candidateTransportationDao.updateCandidateTransportation(candidateTransportation);
	}

	public void deleteCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception {
		candidateTransportationDao.deleteCandidateTransportation(candidateTransportation);
	}

	public CandidateTransportation getCandidateTransportation(Integer candidateTransportationId) throws Exception {
		return candidateTransportationDao.getCandidateTransportation(candidateTransportationId);
	}

	public List<CandidateTransportation> getCandidateTransportationList() throws Exception {
		return candidateTransportationDao.getCandidateTransportationList();
	}

	
}
