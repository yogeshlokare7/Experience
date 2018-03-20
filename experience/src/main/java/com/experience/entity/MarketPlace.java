package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "marketplace")
public class MarketPlace {
	
	@Column(name = "first_name")
	String firstName;
	@Column(name = "last_name")
	String lastName;
	@Column(name = "company_name")
	String companyName;
	@Column(name = "address")
	String address;
	@Column(name = "city")
	String city;
	@Column(name = "state")
	String state;
	@Column(name = "zipcode")
	Integer zipcode;
	@Column(name = "country")
	String contry;
	@Column(name = "contact_no")
	Integer contactNo;
	@Column(name = "email")
	String email;
	@Column(name = "web_address")
	String webAddress;
	@Column(name = "username")
	String username;
	@Column(name = "password")
	String password;
	@Column(name = "loginpage")
	String loginpage;
	@Column(name = "advertising_of")
	String advertisingOf;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
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
	public String getWebAddress() {
		return webAddress;
	}
	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginpage() {
		return loginpage;
	}
	public void setLoginpage(String loginpage) {
		this.loginpage = loginpage;
	}
	public String getAdvertisingOf() {
		return advertisingOf;
	}
	public void setAdvertisingOf(String advertisingOf) {
		this.advertisingOf = advertisingOf;
	} 
}
