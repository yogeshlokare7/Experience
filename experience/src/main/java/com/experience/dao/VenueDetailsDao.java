package com.experience.dao;

import java.util.List;

import com.experience.entity.VenueDetails;

public interface VenueDetailsDao {
	
	public Integer saveVenueDetails(VenueDetails venueDetails) throws Exception;

	public VenueDetails updateVenueDetails(VenueDetails venueDetails) throws Exception;

	public void deleteVenueDetails(VenueDetails venueDetails) throws Exception;

	public VenueDetails getVenueDetails(Integer venueDetailsId) throws Exception;

	public List<VenueDetails> getVenueDetailsList() throws Exception;
	
}
