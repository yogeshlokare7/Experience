package com.experience.dao;

import java.util.List;

import com.experience.entity.Accommodation;

public interface AccommodationDao {

	public Integer saveAccommodation(Accommodation accommodation) throws Exception;

	public Accommodation updateAccommodation(Accommodation accommodation) throws Exception;

	public void deleteAccommodation(Accommodation accommodation) throws Exception;

	public Accommodation getAccommodation(Integer accommodationId) throws Exception;

	public List<Accommodation> getAccommodationList() throws Exception;
	
}
