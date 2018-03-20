package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.VenueDetails;

@Service
public interface VenueDetailsService {

	public Integer saveVenueDetails(VenueDetails venueDetails) throws Exception;

	public VenueDetails updateVenueDetails(VenueDetails venueDetails) throws Exception;

	public void deleteVenueDetails(VenueDetails venueDetails) throws Exception;

	public VenueDetails getVenueDetails(Integer venueDetailsId) throws Exception;

	public List<VenueDetails> getVenueDetailsList() throws Exception;
	
}
