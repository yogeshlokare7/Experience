package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Transportation;

@Service
public interface TransportationService {

	public Integer saveTransportation(Transportation transportation) throws Exception;

	public Transportation updateTransportation(Transportation transportation) throws Exception;

	public void deleteTransportation(Transportation transportation) throws Exception;

	public Transportation getTransportation(Integer transportationId) throws Exception;

	public List<Transportation> getTransportationList() throws Exception;
	
}
