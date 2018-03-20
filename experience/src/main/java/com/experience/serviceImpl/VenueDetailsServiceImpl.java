package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.VenueDetailsDao;
import com.experience.entity.VenueDetails;
import com.experience.service.VenueDetailsService;

@Service
public class VenueDetailsServiceImpl implements VenueDetailsService{
	
	@Autowired
	protected VenueDetailsDao venuedetailsDao; 

	public Integer saveVenueDetails(VenueDetails venueDetails) throws Exception {
		return venuedetailsDao.saveVenueDetails(venueDetails);
	}

	public VenueDetails updateVenueDetails(VenueDetails venueDetails) throws Exception {
		return venuedetailsDao.updateVenueDetails(venueDetails);
	}

	public void deleteVenueDetails(VenueDetails venueDetails) throws Exception {
		venuedetailsDao.deleteVenueDetails(venueDetails);
	}

	public VenueDetails getVenueDetails(Integer venueDetailsId) throws Exception {
		return venuedetailsDao.getVenueDetails(venueDetailsId);
	}

	public List<VenueDetails> getVenueDetailsList() throws Exception {
		return venuedetailsDao.getVenueDetailsList();
	}

}
