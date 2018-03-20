package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Event;

@Service
public interface EventService {

	public Integer saveEvent(Event event) throws Exception;

	public Event updateEvent(Event event) throws Exception;

	public void deleteEvent(Event event) throws Exception;

	public Event getEvent(Integer eventId) throws Exception;

	public List<Event> getEventList() throws Exception;
	
}
