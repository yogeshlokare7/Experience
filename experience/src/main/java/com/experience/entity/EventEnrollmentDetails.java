package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "event_enrollment_details")

public class EventEnrollmentDetails {

	@Column(name = "event_enroll_id")
	Integer eventEnrollId;

	@Column(name = "enroll_payment_type")
	String eventEnrollType;

	@Column(name = "date_of_birth")
	String dob;

	@Column(name = "gender")
	String gender;

	@Column(name = "contact_no")
	Integer contactNo;

	@Column(name = "email")
	String email;

	@Column(name = "address")
	String address;

	@Column(name = "province")
	String province;

	@Column(name = "country")
	String country;

	public Integer getEventEnrollId() {
		return eventEnrollId;
	}

	public void setEventEnrollId(Integer eventEnrollId) {
		this.eventEnrollId = eventEnrollId;
	}

	public String getEventEnrollType() {
		return eventEnrollType;
	}

	public void setEventEnrollType(String eventEnrollType) {
		this.eventEnrollType = eventEnrollType;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getContactNo() {
		return contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
