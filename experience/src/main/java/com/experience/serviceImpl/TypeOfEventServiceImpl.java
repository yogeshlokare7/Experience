package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.TypeOfEventDao;
import com.experience.entity.TypeOfEvent;
import com.experience.service.TypeOfEventService;


@Service
public class TypeOfEventServiceImpl implements TypeOfEventService {

	@Autowired
	protected TypeOfEventDao typeOfEventDao;

	public Integer saveTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception {
		return typeOfEventDao.saveTypeOfEvent(typeOfEvent);
	}

	public TypeOfEvent updateTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception {
		return typeOfEventDao.updateTypeOfEvent(typeOfEvent); 
	}

	public void deleteTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception {
		typeOfEventDao.deleteTypeOfEvent(typeOfEvent);
	}

	public TypeOfEvent getTypeOfEvent(Integer typeOfEventId) throws Exception {
		return typeOfEventDao.getTypeOfEvent(typeOfEventId); 
	}

	public List<TypeOfEvent> getTypeOfEventList() throws Exception {
		return typeOfEventDao.getTypeOfEventList(); 
	}

}
