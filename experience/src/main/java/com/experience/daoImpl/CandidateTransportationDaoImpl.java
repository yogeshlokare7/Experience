package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.CandidateTransportationDao;
import com.experience.entity.CandidateTransportation;

@Repository
public class CandidateTransportationDaoImpl extends EntityTransactionImpl<CandidateTransportation> implements CandidateTransportationDao{

	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception {
		return saveEntity(candidateTransportation, sessionFactory);
	}

	public CandidateTransportation updateCandidateTransportation(CandidateTransportation candidateTransportation)
			throws Exception {
		return updateEntity(candidateTransportation, sessionFactory);
	}

	public void deleteCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception {
		deleteEntity(candidateTransportation, sessionFactory);
	}

	public CandidateTransportation getCandidateTransportation(Integer candidateTransportationId) throws Exception {
		return getEntity(new CandidateTransportation(), candidateTransportationId, sessionFactory);
	}

	public List<CandidateTransportation> getCandidateTransportationList() throws Exception {
		return getEntityList(new CandidateTransportation(), sessionFactory);
	}

	
}
