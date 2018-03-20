package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.EventEnrollmentDetailsDao;
import com.experience.entity.EventEnrollmentDetails;

@Repository
public class EventEnrollmentDetailsDaoImpl extends EntityTransactionImpl<EventEnrollmentDetails> implements EventEnrollmentDetailsDao{

	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails) throws Exception {
		return saveEntity(eventEnrollmentDetails, sessionFactory);
	}

	public EventEnrollmentDetails updateEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails)
			throws Exception {
		return updateEntity(eventEnrollmentDetails, sessionFactory);
	}

	public void deleteEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails) throws Exception {
		deleteEntity(eventEnrollmentDetails, sessionFactory);
	}

	public EventEnrollmentDetails getEventEnrollmentDetails(Integer eventEnrollmentDetailsId) throws Exception {
		return getEntity(new EventEnrollmentDetails(), eventEnrollmentDetailsId, sessionFactory);
	}

	public List<EventEnrollmentDetails> getEventEnrollmentDetailsList() throws Exception {
		return getEntityList(new EventEnrollmentDetails(), sessionFactory);
	}
	
	
}
