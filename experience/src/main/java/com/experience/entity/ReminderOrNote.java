package com.experience.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "reminder_or_note")
public class ReminderOrNote {

	@Column(name = "reminder_id")
	Integer reminderId;

	@Column(name = "reminder_date")
	Date reminderDate;

	@Column(name = "reminder_time")
	Time reminderTime;

	@Column(name = "message")
	String message;

	public Integer getReminderId() {
		return reminderId;
	}

	public void setReminderId(Integer reminderId) {
		this.reminderId = reminderId;
	}

	public Date getReminderDate() {
		return reminderDate;
	}

	public void setReminderDate(Date reminderDate) {
		this.reminderDate = reminderDate;
	}

	public Time getReminderTime() {
		return reminderTime;
	}

	public void setReminderTime(Time reminderTime) {
		this.reminderTime = reminderTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

}
