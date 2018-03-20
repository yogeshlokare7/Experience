package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.AccommodationTypeDao;
import com.experience.entity.AccommodationType;

@Repository
public class AccommodationTypeDaoImpl extends EntityTransactionImpl<AccommodationType> implements AccommodationTypeDao{
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveAaccommodationType(AccommodationType accommodationType) throws Exception {
		return saveEntity(accommodationType, sessionFactory);
	}

	public AccommodationType updateAaccommodationType(AccommodationType accommodationType) throws Exception {
		return updateEntity(accommodationType, sessionFactory);
	}

	public void deleteAaccommodationType(AccommodationType accommodationType) throws Exception {
		deleteEntity(accommodationType, sessionFactory);
	}

	public AccommodationType getAaccommodationType(Integer accommodationTypeId) throws Exception {
		return getEntity(new AccommodationType(), accommodationTypeId, sessionFactory);
	}

	public List<AccommodationType> getAaccommodationTypeList() throws Exception {
		return getEntityList(new AccommodationType(), sessionFactory);
	}

}
