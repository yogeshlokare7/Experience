package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.InsuranceDao;
import com.experience.entity.Insurance;

@Repository
public class InsuranceDaoImpl extends EntityTransactionImpl<Insurance> implements InsuranceDao{
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveInsurance(Insurance insurance) throws Exception {
		return saveEntity(insurance, sessionFactory);
	}

	public Insurance updateInsurance(Insurance insurance) throws Exception {
		return updateEntity(insurance, sessionFactory);
	}

	public void deleteInsurance(Insurance insurance) throws Exception {
		deleteEntity(insurance, sessionFactory);
	}

	public Insurance getInsurance(Integer insuranceId) throws Exception {
		return getEntity(new Insurance(), insuranceId, sessionFactory);
	}

	public List<Insurance> getInsuranceList() throws Exception {
		return getEntityList(new Insurance(), sessionFactory);
	}
	
	
}
