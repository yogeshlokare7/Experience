package com.experience.dto;

import com.experience.entity.VenueDetails;

public class VenueDetailsDto {

	Integer venueId;
	String venueAddress;
	String landmark;
	String province;
	String country;
	
	
	
public VenueDetailsDto() {
		
	}
	
	public VenueDetailsDto(VenueDetails venuedetails) {
		setVenueId(venuedetails.getVenueId());
		setVenueAddress(venuedetails.getVenueAddress());
		setLandmark(venuedetails.getLandmark());
		setProvince(venuedetails.getProvince());
		setCountry(venuedetails.getCountry());
		
		
	}
	public VenueDetails  getEntityFromDTO() {
		VenueDetails venuedetails= new VenueDetails ();
		venuedetails.setVenueId(getVenueId());
		venuedetails.setVenueAddress(getVenueAddress());
		venuedetails.setLandmark(getLandmark());
		venuedetails.setProvince(getProvince());
		venuedetails.setCountry(getCountry());
		return venuedetails;
	}
	



	public Integer getVenueId() {
		return venueId;
	}
	public void setVenueId(Integer venueId) {
		this.venueId = venueId;
	}
	public String getVenueAddress() {
		return venueAddress;
	}
	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


}
