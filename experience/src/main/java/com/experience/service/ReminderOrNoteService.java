package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.ReminderOrNote;

@Service
public interface ReminderOrNoteService {

	public Integer saveReminderOrNote(ReminderOrNote reminderOrNote) throws Exception;

	public ReminderOrNote updateReminderOrNote(ReminderOrNote reminderOrNote) throws Exception;

	public void deleteReminderOrNote(ReminderOrNote reminderOrNote) throws Exception;

	public ReminderOrNote getReminderOrNote(Integer reminderOrNoteId) throws Exception;

	public List<ReminderOrNote> getReminderOrNoteList() throws Exception;
	
}
