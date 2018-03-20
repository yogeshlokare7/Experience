package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.AccommodationDao;
import com.experience.entity.Accommodation;

@Repository
public class AccommodationDaoImpl extends EntityTransactionImpl<Accommodation> implements AccommodationDao {
	
	@Autowired
	protected SessionFactory sessionFactory;


	public Integer saveAccommodation(Accommodation accommodation) throws Exception {
		return saveEntity(accommodation, sessionFactory);
	}

	public Accommodation updateAccommodation(Accommodation accommodation) throws Exception {
		return updateEntity(accommodation, sessionFactory);
	}

	public void deleteAccommodation(Accommodation accommodation) throws Exception {
		deleteEntity(accommodation, sessionFactory);
	}

	public Accommodation getAccommodation(Integer accommodationId) throws Exception {
		return getEntity(new Accommodation(), accommodationId, sessionFactory);
	}

	public List<Accommodation> getAccommodationList() throws Exception {
		return getEntityList(new Accommodation(), sessionFactory);
	}
	

}
