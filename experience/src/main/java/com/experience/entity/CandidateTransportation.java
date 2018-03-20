package com.experience.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "candidate_transportation")
public class CandidateTransportation {

	@Column(name = "transportation_id")
	String transportationId;

	@Column(name = "travel_date")
	Date travelDate;

	@Column(name = "pickup_time")
	Time pickupTime;

	@Column(name = "drop_time")
	Time dropTime;

	public String getTransportationId() {
		return transportationId;
	}

	public void setTransportationId(String transportationId) {
		this.transportationId = transportationId;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Time getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(Time pickupTime) {
		this.pickupTime = pickupTime;
	}

	public Time getDropTime() {
		return dropTime;
	}

	public void setDropTime(Time dropTime) {
		this.dropTime = dropTime;
	}

}
