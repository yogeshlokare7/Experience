package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.TypeOfEventDao;
import com.experience.entity.TypeOfEvent;

@Repository
public class TypeOfEventDaoImpl extends EntityTransactionImpl<TypeOfEvent> implements TypeOfEventDao{

	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception {
		return saveEntity(typeOfEvent, sessionFactory);
	}

	public TypeOfEvent updateTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception {
		return updateEntity(typeOfEvent, sessionFactory);
	}

	public void deleteTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception {
		deleteEntity(typeOfEvent, sessionFactory);
	}

	public TypeOfEvent getTypeOfEvent(Integer typeOfEventId) throws Exception {
		return getEntity(new TypeOfEvent(),typeOfEventId, sessionFactory);
	}

	public List<TypeOfEvent> getTypeOfEventList() throws Exception {
		return getEntityList(new TypeOfEvent(), sessionFactory);
	}
	
}
