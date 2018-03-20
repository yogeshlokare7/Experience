package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.EventDao;
import com.experience.entity.Event;

@Repository
public class EventDaoImpl extends EntityTransactionImpl<Event> implements EventDao {

	@Autowired
	protected SessionFactory sessionFactory;
	
	
	public Integer saveEvent(Event event) throws Exception {
		return saveEntity(event, sessionFactory);
	}

	public Event updateEvent(Event event) throws Exception {
		return updateEntity(event, sessionFactory);
	}

	public void deleteEvent(Event event) throws Exception {
		deleteEntity(event, sessionFactory);
	}

	public Event getEvent(Integer eventId) throws Exception {
		return getEntity(new Event(), eventId, sessionFactory);
	}

	public List<Event> getEventList() throws Exception {
		return getEntityList(new Event(), sessionFactory);
	}

}
