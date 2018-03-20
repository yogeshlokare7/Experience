package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.AccommodationTypeDao;
import com.experience.entity.AccommodationType;
import com.experience.service.AccommodationTypeService;

@Service
public class AccommodationTypeServiceImpl  implements AccommodationTypeService{
	
	@Autowired
	protected AccommodationTypeDao accommodationTypeDao;

	public Integer saveAaccommodationType(AccommodationType accommodationType) throws Exception {
		return accommodationTypeDao.saveAaccommodationType(accommodationType); 
	}

	public AccommodationType updateAaccommodationType(AccommodationType accommodationType) throws Exception {
		return accommodationTypeDao.updateAaccommodationType(accommodationType);
	}

	public void deleteAaccommodationType(AccommodationType accommodationType) throws Exception {
		accommodationTypeDao.deleteAaccommodationType(accommodationType);
	}

	public AccommodationType getAaccommodationType(Integer accommodationTypeId) throws Exception {
		return accommodationTypeDao.getAaccommodationType(accommodationTypeId);
	}

	public List<AccommodationType> getAaccommodationTypeList() throws Exception {
		return accommodationTypeDao.getAaccommodationTypeList();
	}

}
