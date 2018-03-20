package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Accommodation;

@Service
public interface AccommodationService {

	public Integer saveAccommodation(Accommodation accommodation) throws Exception;

	public Accommodation updateAccommodation(Accommodation accommodation) throws Exception;

	public void deleteAccommodation(Accommodation accommodation) throws Exception;

	public Accommodation getAccommodation(Integer accommodationId) throws Exception;

	public List<Accommodation> getAccommodationList() throws Exception;
}
