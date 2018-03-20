package com.experience.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "transportation")
public class Transportation {
	
	 @Column(name = "transport_id")
	 Integer transportId;
	 @Column(name = "name")
	 String name;
	 @Column(name = "vehicle _type")
	 String vehicleType;
	 @Column(name = "vehicle _no")
	 Integer vehicleNo;
	 @Column(name = "travel_date")
	 Date travelDate;
	 @Column(name = "start_time")
	 String startTime;
	 @Column(name = "end_time")
	 String endTime;
	 @Column(name = "fare")
	 double  fare;

	public String getName() {
		return name;
	}
	public Integer getTransportId() {
		return transportId;
	}
	public void setTransportId(Integer transportId) {
		this.transportId = transportId;
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
