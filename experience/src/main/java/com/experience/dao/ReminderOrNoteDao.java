package com.experience.dao;

import java.util.List;

import com.experience.entity.ReminderOrNote;

public interface ReminderOrNoteDao {
	
	public Integer saveReminderOrNote(ReminderOrNote reminderOrNote) throws Exception;

	public ReminderOrNote updateReminderOrNote(ReminderOrNote reminderOrNote) throws Exception;

	public void deleteReminderOrNote(ReminderOrNote reminderOrNote) throws Exception;

	public ReminderOrNote getReminderOrNote(Integer reminderOrNoteId) throws Exception;

	public List<ReminderOrNote> getReminderOrNoteList() throws Exception;
	
}
