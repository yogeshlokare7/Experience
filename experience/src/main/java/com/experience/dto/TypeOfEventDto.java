package com.experience.dto;

import com.experience.entity.TypeOfEvent;
import com.experience.entity.UserGroup;

public class TypeOfEventDto {

	Integer eventTypeId;
	String eventTypeName;
	String chargeableAmount;
	
	
	
public TypeOfEventDto() {
		
	}
	
	public TypeOfEventDto(TypeOfEvent typeofevent) {
		setEventTypeId(typeofevent.getEventTypeId());
		setEventTypeName(typeofevent.getEventTypeName());
		setChargeableAmount(typeofevent.getChargeableAmount());
		
	}
	public TypeOfEvent  getEntityFromDTO() {
		TypeOfEvent typeofevent= new TypeOfEvent();
		typeofevent.setEventTypeId(getEventTypeId());
		typeofevent.setEventTypeName(getEventTypeName());
		typeofevent.setChargeableAmount(getChargeableAmount());
		
		return typeofevent;
	}

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
