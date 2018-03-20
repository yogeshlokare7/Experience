package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Type_of_event")
public class TypeOfEvent {

	@Column(name = "event_type_id")
	Integer eventTypeId;
	@Column(name = "event_type_name")
	String eventTypeName;
	@Column(name = "chargeable_amount")
	String chargeableAmount;

	public Integer getEventTypeId() {
		return eventTypeId;
	}

	public void setEventTypeId(Integer eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public String getEventTypeName() {
		return eventTypeName;
	}

	public void setEventTypeName(String eventTypeName) {
		this.eventTypeName = eventTypeName;
	}

	public String getChargeableAmount() {
		return chargeableAmount;
	}

	public void setChargeableAmount(String chargeableAmount) {
		this.chargeableAmount = chargeableAmount;
	}

}
