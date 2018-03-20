package com.experience.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "accommodation")
public class Accommodation {

	@Column(name = "accommodation_id")
	Integer accommodationId;
	@Column(name = "accommodation_days")
	String accommodationDays;
	@Column(name = "start_date")
	Date startDate;
	@Column(name = "end_date")
	Date endDate;
	@Column(name = "check_in")
	String checkIn;
	@Column(name = "check_out")
	String checkOut;
	@Column(name = "fare")
	double fare;
	@Column(name = "latitude")
	String latitude;
	@Column(name = "longitude")
	String longitude;

	public Integer getAccommodationId() {
		return accommodationId;
	}

	public void setAccommodationId(Integer accommodationId) {
		this.accommodationId = accommodationId;
	}

	public String getAccommodationDays() {
		return accommodationDays;
	}

	public void setAccommodationDays(String accommodationDays) {
		this.accommodationDays = accommodationDays;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
