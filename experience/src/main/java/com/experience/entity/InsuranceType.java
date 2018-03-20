package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="insurance_type")
public class InsuranceType {

	@Column(name = "insurance_type_id")
	Integer insurancetypeId;

	@Column(name = "insurance_type_name")
	String insuranceTypeName;

	@Column(name = "description")
	String description;

	public Integer getInsurancetypeId() {
		return insurancetypeId;
	}

	public void setInsurancetypeId(Integer insurancetypeId) {
		this.insurancetypeId = insurancetypeId;
	}

	public String getInsuranceTypeName() {
		return insuranceTypeName;
	}

	public void setInsuranceTypeName(String insuranceTypeName) {
		this.insuranceTypeName = insuranceTypeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
