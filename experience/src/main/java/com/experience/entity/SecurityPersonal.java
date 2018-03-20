package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "security_personnel")
public class SecurityPersonal {

	   @Column(name = "security_personnel_d")
	   Integer  securityPersonnelId;

	   @Column(name = "security_name")
	   String  securityName; 
	  
	   @Column(name = "gender")
	   String  gender;
	  
	   @Column(name = "address")
	   String  address;
	  
	   @Column(name = "province")
	   String  province;
	  
	   @Column(name = "country")
	   String  country;
	  
	   @Column(name = "security_contact_no")
	   Integer  securityContactNo;

	public Integer getSecurityPersonnelId() {
		return securityPersonnelId;
	}

	public void setSecurityPersonnelId(Integer securityPersonnelId) {
		this.securityPersonnelId = securityPersonnelId;
	}

	public String getSecurityName() {
		return securityName;
	}

	public void setSecurityName(String securityName) {
		this.securityName = securityName;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getSecurityContactNo() {
		return securityContactNo;
	}

	public void setSecurityContactNo(Integer securityContactNo) {
		this.securityContactNo = securityContactNo;
	}

	public String getProvince() {
		return province;
	}

}
