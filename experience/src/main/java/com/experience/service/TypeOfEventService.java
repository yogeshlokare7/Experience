package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.TypeOfEvent;

@Service
public interface TypeOfEventService {

	public Integer saveTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception;

	public TypeOfEvent updateTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception;

	public void deleteTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception;

	public TypeOfEvent getTypeOfEvent(Integer typeOfEventId) throws Exception;

	public List<TypeOfEvent> getTypeOfEventList() throws Exception;
	
}
