package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.AccommodationType;

@Service
public interface AccommodationTypeService {

	public Integer saveAaccommodationType(AccommodationType accommodationType) throws Exception;

	public AccommodationType updateAaccommodationType(AccommodationType accommodationType) throws Exception;

	public void deleteAaccommodationType(AccommodationType accommodationType) throws Exception;

	public AccommodationType getAaccommodationType(Integer accommodationTypeId) throws Exception;

	public List<AccommodationType> getAaccommodationTypeList() throws Exception;
	
}
