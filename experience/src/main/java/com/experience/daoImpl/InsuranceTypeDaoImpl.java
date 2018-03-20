package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.InsuranceTypeDao;
import com.experience.entity.InsuranceType;

@Repository
public class InsuranceTypeDaoImpl extends EntityTransactionImpl<InsuranceType> implements InsuranceTypeDao{
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveInsuranceType(InsuranceType insuranceType) throws Exception {
		return saveEntity(insuranceType, sessionFactory);
	}

	public InsuranceType updateInsuranceType(InsuranceType insuranceType) throws Exception {
		return updateEntity(insuranceType, sessionFactory);
	}

	public void deleteInsuranceType(InsuranceType insuranceType) throws Exception {
		deleteEntity(insuranceType, sessionFactory);
	}

	public InsuranceType getInsuranceType(Integer insuranceTypeId) throws Exception {
		return getEntity(new InsuranceType(), insuranceTypeId, sessionFactory);
	}

	public List<InsuranceType> getInsuranceTypeList() throws Exception {
		return getEntityList(new InsuranceType(), sessionFactory);
	}
	
	

}
