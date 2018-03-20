package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "event_status")
public class EventStatus {

	@Column(name = "event_status_code")
	Integer eventStatusCode;
	@Column(name = "event_status_comment")
	String eventStatusComment;

	public Integer getEventStatusCode() {
		return eventStatusCode;
	}

	public void setEventStatusCode(Integer eventStatusCode) {
		this.eventStatusCode = eventStatusCode;
	}

	public String getEventStatusComment() {
		return eventStatusComment;
	}

	public void setEventStatusComment(String eventStatusComment) {
		this.eventStatusComment = eventStatusComment;
	}

}
