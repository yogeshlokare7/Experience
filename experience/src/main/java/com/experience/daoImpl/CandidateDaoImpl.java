package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.CandidateDao;
import com.experience.entity.Candidate;

@Repository
public class CandidateDaoImpl extends EntityTransactionImpl<Candidate> implements CandidateDao {
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveCandidate(Candidate candidate) throws Exception {
		return saveEntity(candidate, sessionFactory);
	}

	public Candidate updateCandidate(Candidate candidate) throws Exception {
		return updateEntity(candidate, sessionFactory);
	}

	public void deleteCandidate(Candidate candidate) throws Exception {
		deleteEntity(candidate, sessionFactory);
	}

	public Candidate getCandidate(Integer candidateId) throws Exception {
		return getEntity(new Candidate(), candidateId, sessionFactory);
	}

	public List<Candidate> getCandidateList() throws Exception {
		return getEntityList(new Candidate(), sessionFactory);
	}
	
	
}
