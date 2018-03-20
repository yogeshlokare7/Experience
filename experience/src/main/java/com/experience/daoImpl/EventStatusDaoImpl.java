package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.EventEnrollmentDetailsDao;
import com.experience.dao.EventStatusDao;
import com.experience.entity.EventEnrollmentDetails;
import com.experience.entity.EventStatus;

@Repository
public class EventStatusDaoImpl extends EntityTransactionImpl<EventEnrollmentDetails> implements EventStatusDao{

	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveEventStatus(EventStatus eventStatus) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer updateEventStatus(EventStatus eventStatus) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEventStatus(EventStatus eventStatus) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public EventStatus getEventStatus(Integer eventStatusId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EventStatus> getEventStatusList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
