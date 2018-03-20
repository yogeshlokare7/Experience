package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.EventEnrollmentDetailsDao;
import com.experience.entity.EventEnrollmentDetails;
import com.experience.service.EventEnrollmentDetailsService;

@Service
public class EventEnrollmentDetailsServiceImpl  implements EventEnrollmentDetailsService{

	@Autowired
	protected EventEnrollmentDetailsDao EventEnrollmentDetailsDao ;

	public Integer saveEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails) throws Exception {
		return EventEnrollmentDetailsDao.saveEventEnrollmentDetails(eventEnrollmentDetails);
	}

	public EventEnrollmentDetails updateEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails)
			throws Exception {
		return EventEnrollmentDetailsDao.updateEventEnrollmentDetails(eventEnrollmentDetails);
	}

	public void deleteEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails) throws Exception {
		EventEnrollmentDetailsDao.deleteEventEnrollmentDetails(eventEnrollmentDetails);
	}

	public EventEnrollmentDetails getEventEnrollmentDetails(Integer eventEnrollmentDetailsId) throws Exception {
		return EventEnrollmentDetailsDao.getEventEnrollmentDetails(eventEnrollmentDetailsId);
	}

	public List<EventEnrollmentDetails> getEventEnrollmentDetailsList() throws Exception {
		return EventEnrollmentDetailsDao.getEventEnrollmentDetailsList();
	}
	
	
}
