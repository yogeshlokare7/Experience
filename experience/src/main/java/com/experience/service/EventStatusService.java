package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.EventStatus;

@Service
public interface EventStatusService {

	public Integer saveEventStatus(EventStatus eventStatus) throws Exception;

	public Integer updateEventStatus(EventStatus eventStatus) throws Exception;

	public void deleteEventStatus(EventStatus eventStatus) throws Exception;

	public EventStatus getEventStatus(Integer eventStatusId) throws Exception;

	public List<EventStatus> getEventStatusList() throws Exception;
	
}
