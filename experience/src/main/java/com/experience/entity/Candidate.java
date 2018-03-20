package com.experience.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="candidate")
public class Candidate {

	@Column(name = "candidate_id")
	Integer candidateId;

	@Column(name = "candidate_first_name")
	String candidateFirstName;

	@Column(name = "candidate_last_name")
	String candidateLastName;

	@Column(name = "date_of_birth")
	Date dob;

	@Column(name = "gender")
	String gender;

	@Column(name = "contact_no")
	String contactNo;

	@Column(name = "candidate_email")
	String candidateEmail;

	@Column(name = "candidate_address")
	String candidateAddress;

	@Column(name = "candidate_province")
	String candidateProvince;

	@Column(name = "candidate_country")
	String candidateCountry;

	@Column(name = "lattitude")
	String lattitude;

	@Column(name = "longitude")
	String longitude;

	public Integer getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateFirstName() {
		return candidateFirstName;
	}

	public void setCandidateFirstName(String candidateFirstName) {
		this.candidateFirstName = candidateFirstName;
	}

	public String getCandidateLastName() {
		return candidateLastName;
	}

	public void setCandidateLastName(String candidateLastName) {
		this.candidateLastName = candidateLastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCandidateEmail() {
		return candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	public String getCandidateAddress() {
		return candidateAddress;
	}

	public void setCandidateAddress(String candidateAddress) {
		this.candidateAddress = candidateAddress;
	}

	public String getCandidateProvince() {
		return candidateProvince;
	}

	public void setCandidateProvince(String candidateProvince) {
		this.candidateProvince = candidateProvince;
	}

	public String getCandidateCountry() {
		return candidateCountry;
	}

	public void setCandidateCountry(String candidateCountry) {
		this.candidateCountry = candidateCountry;
	}

	public String getLattitude() {
		return lattitude;
	}

	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	
}
