package com.experience.dao;

import java.util.List;

import com.experience.entity.Transportation;

public interface TransportationDao {

	public Integer saveTransportation(Transportation transportation) throws Exception;

	public Transportation updateTransportation(Transportation transportation) throws Exception;

	public void deleteTransportation(Transportation transportation) throws Exception;

	public Transportation getTransportation(Integer transportationId) throws Exception;

	public List<Transportation> getTransportationList() throws Exception;
	
}
