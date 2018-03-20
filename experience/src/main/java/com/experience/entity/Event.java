package com.experience.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "event")

public class Event {

	@Column(name = "event_id")
	Integer eventId;

	@Column(name = "event_name")
	String eventName;

	@Column(name = "duration")
	String duration;

	@Column(name = "start_date")
	Date startDate;

	@Column(name = "end_date")
	Date endDate;

	@Column(name = "start_time")
	Time startTime;

	@Column(name = "end_time")
	Time endTime;

	@Column(name = "location")
	String location;

	@Column(name = "payment")
	Integer payment;

	@Column(name = "seat_capacity")
	Integer seatCapacity;

	@Column(name = "no_of_ticket")
	Integer noOfTicket;

	@Column(name = "no_of_ticket_left")
	Integer noOfTicketLeft;

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
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

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getPayment() {
		return payment;
	}

	public void setPayment(Integer payment) {
		this.payment = payment;
	}

	public Integer getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(Integer seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public Integer getNoOfTicket() {
		return noOfTicket;
	}

	public void setNoOfTicket(Integer noOfTicket) {
		this.noOfTicket = noOfTicket;
	}

	public Integer getNoOfTicketLeft() {
		return noOfTicketLeft;
	}

	public void setNoOfTicketLeft(Integer noOfTicketLeft) {
		this.noOfTicketLeft = noOfTicketLeft;
	}

}
