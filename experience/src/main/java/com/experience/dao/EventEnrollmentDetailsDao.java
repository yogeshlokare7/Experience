package com.experience.dao;

import java.util.List;

import com.experience.entity.EventEnrollmentDetails;

public interface EventEnrollmentDetailsDao {

	public Integer saveEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails)  throws Exception;

	public EventEnrollmentDetails updateEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails) throws Exception;

	public void deleteEventEnrollmentDetails(EventEnrollmentDetails eventEnrollmentDetails) throws Exception;

	public EventEnrollmentDetails getEventEnrollmentDetails(Integer eventEnrollmentDetailsId) throws Exception;

	public List<EventEnrollmentDetails> getEventEnrollmentDetailsList() throws Exception;
}
