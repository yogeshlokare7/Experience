package com.experience.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.EventDao;
import com.experience.entity.Event;
import com.experience.service.EventService;

@Service
public class EventServiceImpl  implements EventService{

	@Autowired
	protected EventDao eventDao;
	
	
	public Integer saveEvent(Event event) throws Exception {
		return eventDao.saveEvent(event);
	}

	public Event updateEvent(Event event) throws Exception {
		return eventDao.updateEvent(event);
	}

	public void deleteEvent(Event event) throws Exception {
		eventDao.deleteEvent(event);
	}

	public Event getEvent(Integer eventId) throws Exception {
		return eventDao.getEvent(eventId);
	}

	public List<Event> getEventList() throws Exception {
		return eventDao.getEventList();
	}

}
