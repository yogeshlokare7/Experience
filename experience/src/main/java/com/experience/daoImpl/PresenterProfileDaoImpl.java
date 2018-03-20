package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.PresenterProfileDao;
import com.experience.entity.PresenterProfile;

@Repository
public class PresenterProfileDaoImpl extends EntityTransactionImpl<PresenterProfile> implements PresenterProfileDao {

	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer savePresenterProfile(PresenterProfile presenterProfile) throws Exception {
		return saveEntity(presenterProfile, sessionFactory);
	}

	public PresenterProfile updatePresenterProfile(PresenterProfile presenterProfile) throws Exception {
		return updateEntity(presenterProfile, sessionFactory);
	}

	public void deletePresenterProfile(PresenterProfile presenterProfile) throws Exception {
		deleteEntity(presenterProfile, sessionFactory);
	}

	public PresenterProfile getPresenterProfile(Integer presenterProfileId) throws Exception {
		return getEntity(new PresenterProfile(), presenterProfileId, sessionFactory);
	}

	public List<PresenterProfile> getPresenterProfileList() throws Exception {
		return getEntityList(new PresenterProfile(), sessionFactory);
	}
}
