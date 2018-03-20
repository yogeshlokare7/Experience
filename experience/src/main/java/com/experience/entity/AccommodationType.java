package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "accommodation_type")
public class AccommodationType {

	@Column(name="accommodation_id")
	Integer accommodationId;

	@Column(name="accommodation_type")
	String accommodationTypeName;

	public Integer getAccommodationId() {
		return accommodationId;
	}

	public void setAccommodationId(Integer accommodationId) {
		this.accommodationId = accommodationId;
	}

	public String getAccommodationTypeName() {
		return accommodationTypeName;
	}

	public void setAccommodationTypeName(String accommodationTypeName) {
		this.accommodationTypeName = accommodationTypeName;
	}

	
}
