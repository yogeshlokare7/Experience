package com.experience.dao;

import java.util.List;

import com.experience.entity.Event;

public interface EventDao {

	public Integer saveEvent(Event event) throws Exception;

	public Event updateEvent(Event event) throws Exception;

	public void deleteEvent(Event event) throws Exception;

	public Event getEvent(Integer eventId) throws Exception;

	public List<Event> getEventList() throws Exception;
	
}
