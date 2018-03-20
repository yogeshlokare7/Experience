package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.EventEnrollmentDetails;

@Service
public interface EventEnrollmentDetailsService {

	
	public Integer saveEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails)  throws Exception;

	public EventEnrollmentDetails updateEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails) throws Exception;

	public void deleteEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails) throws Exception;

	public EventEnrollmentDetails getEventEnrollmentDetails(Integer eventEnrollmentDetailsId) throws Exception;

	public List<EventEnrollmentDetails> getEventEnrollmentDetailsList() throws Exception;
	
}
