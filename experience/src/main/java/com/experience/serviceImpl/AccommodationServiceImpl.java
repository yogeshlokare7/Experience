package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.AccommodationDao;
import com.experience.entity.Accommodation;
import com.experience.service.AccommodationService;

@Service
public class AccommodationServiceImpl  implements AccommodationService{
	
	@Autowired
	protected AccommodationDao accommodationDao;


	public Integer saveAccommodation(Accommodation accommodation) throws Exception {
		return accommodationDao.saveAccommodation(accommodation);
	}

	public Accommodation updateAccommodation(Accommodation accommodation) throws Exception {
		return accommodationDao.updateAccommodation(accommodation);
	}

	public void deleteAccommodation(Accommodation accommodation) throws Exception {
		accommodationDao.deleteAccommodation(accommodation);
	}

	public Accommodation getAccommodation(Integer accommodationId) throws Exception {
		return accommodationDao.getAccommodation(accommodationId);
	}

	public List<Accommodation> getAccommodationList() throws Exception {
		return accommodationDao.getAccommodationList();
	}
	

}
