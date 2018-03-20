package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.ReminderOrNoteDao;
import com.experience.entity.ReminderOrNote;

@Repository
public class ReminderOrNoteDaoImpl extends EntityTransactionImpl<ReminderOrNote> implements ReminderOrNoteDao {
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveReminderOrNote(ReminderOrNote reminderOrNote) throws Exception {
		return saveEntity(reminderOrNote, sessionFactory);
	}

	public ReminderOrNote updateReminderOrNote(ReminderOrNote reminderOrNote) throws Exception {
		return updateEntity(reminderOrNote, sessionFactory);
	}

	public void deleteReminderOrNote(ReminderOrNote reminderOrNote) throws Exception {
		deleteEntity(reminderOrNote, sessionFactory);
	}

	public ReminderOrNote getReminderOrNote(Integer reminderOrNoteId) throws Exception {
		return getEntity(new ReminderOrNote(), reminderOrNoteId, sessionFactory);
	}

	public List<ReminderOrNote> getReminderOrNoteList() throws Exception {
		return getEntityList(new ReminderOrNote(), sessionFactory);
	}

}
