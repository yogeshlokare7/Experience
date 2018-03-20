package com.experience.dao;

import java.util.List;

import com.experience.entity.EventStatus;

public interface EventStatusDao {
	
	public Integer saveEventStatus(EventStatus eventStatus) throws Exception;

	public Integer updateEventStatus(EventStatus eventStatus) throws Exception;

	public void deleteEventStatus(EventStatus eventStatus) throws Exception;

	public EventStatus getEventStatus(Integer eventStatusId) throws Exception;

	public List<EventStatus> getEventStatusList() throws Exception;
	
}
