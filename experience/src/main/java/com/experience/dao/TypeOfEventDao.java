package com.experience.dao;

import java.util.List;

import com.experience.entity.TypeOfEvent;

public interface TypeOfEventDao {
	
	public Integer saveTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception;

	public TypeOfEvent updateTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception;

	public void deleteTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception;

	public TypeOfEvent getTypeOfEvent(Integer typeOfEventId) throws Exception;

	public List<TypeOfEvent> getTypeOfEventList() throws Exception;
	
}
