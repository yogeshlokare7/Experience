package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.TransportationDao;
import com.experience.entity.Transportation;
import com.experience.service.TransportationService;

@Service
public class TransportationServiceImpl implements TransportationService{

	@Autowired
	protected TransportationDao transportationDao;

	public Integer saveTransportation(Transportation transportation) throws Exception {
		return transportationDao.saveTransportation(transportation);
	}

	public Transportation updateTransportation(Transportation transportation) throws Exception {
		return transportationDao.updateTransportation(transportation);
	}

	public void deleteTransportation(Transportation transportation) throws Exception {
		transportationDao.deleteTransportation(transportation);
	}

	public Transportation getTransportation(Integer transportationId) throws Exception {
		return transportationDao.getTransportation(transportationId);
	}

	public List<Transportation> getTransportationList() throws Exception {
		return transportationDao.getTransportationList();
	}
	
	
}
