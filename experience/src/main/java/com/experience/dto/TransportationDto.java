package com.experience.dto;

import java.util.Date;

import com.experience.entity.Transportation;
import com.experience.entity.VenueDetails;

public class TransportationDto {

	Integer transportId;
	String name;
	String vehicleType;
	Integer vehicleNo;
	Date travelDate;
	String startTime;
	String endTime;
	double  fare;
	
	
public TransportationDto() {
		
	}
	
	public TransportationDto(Transportation transportation) {
		setTransportId(transportation.getTransportId());
		setName(transportation.getName());
		setVehicleType(transportation.getVehicleType());
		setVehicleNo(transportation.getVehicleNo());
		setTravelDate(transportation.getTravelDate());
		setStartTime(transportation.getStartTime());
		setEndTime(transportation.getEndTime());
		setFare(transportation.getFare());
		
	}
	public Transportation  getEntityFromDTO() {
		Transportation transportation= new Transportation ();
		transportation.setTransportId(getTransportId());
		transportation.setName(getName());
		transportation.setVehicleType(getVehicleType());
		transportation.setVehicleNo(getVehicleNo());
		transportation.setTravelDate(getTravelDate());
		transportation.setStartTime(getStartTime());
		transportation.setEndTime(getEndTime());
		transportation.setFare(getFare());
		
		return transportation;
	}
	
	
	

	
	public Integer getTransportId() {
		return transportId;
	}

	public void setTransportId(Integer transportId) {
		this.transportId = transportId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Integer getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(Integer vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}

}
