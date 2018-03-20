package com.experience.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "catering_staff")
public class CateringStaff {

	@Column(name="staff_id")
	Integer staffId;
	
	@Column(name="staff_name")
	String staffName;
    
	@Column(name="no_of_staff")
	String noOfStaff;
	
	@Column(name="salary")
	double salary;
	
	@Column(name="staff_age")
	Integer staffAge;
	
	@Column(name="gender")
    String gender;
	
	@Column(name="date_of_birth")
	Date dob;
	
	@Column(name="address")
	String address;
	
	@Column(name="province")
	String province;
	
	@Column(name="country")
	String country;
	
	@Column(name="email_id")
	String email;

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getNoOfStaff() {
		return noOfStaff;
	}

	public void setNoOfStaff(String noOfStaff) {
		this.noOfStaff = noOfStaff;
	}

	public Integer getStaffAge() {
		return staffAge;
	}

	public void setStaffAge(Integer staffAge) {
		this.staffAge = staffAge;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
