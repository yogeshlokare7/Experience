package com.experience.daoImpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.UserDao;
import com.experience.entity.User;

@Repository
public class UserDaoImpl extends EntityTransactionImpl<User> implements UserDao{

	@Autowired
	protected SessionFactory sessionFactory;
	
	public List<User> getUsers() throws Exception {
		return getEntityList(new User(), sessionFactory);
	}

	public User getUser(Integer id) throws Exception {
		return getEntity(new User(), id, sessionFactory);
	}

	public Integer saveUser(User user) throws Exception {
		return saveEntity(user, sessionFactory);
	}

	public void updateUser(User user) throws Exception {
		updateEntity(user, sessionFactory);
	}

	public void deleteUser(User user) throws Exception {
		deleteEntity(user, sessionFactory);
	}

	@SuppressWarnings("unchecked")
	public User findUserByUseremail(String useremail) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query createQuery = session.createQuery("FROM User u Where u.useremail =:useremail ");
		createQuery.setParameter("useremail", useremail);
		List<User> users = createQuery.list();
		transaction.commit();
		session.close();
		return users!=null?users.get(0):null;
	}

	public User findUserByResetToken(String token) throws Exception {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query createQuery = session.createQuery("FROM User u Where u.resettoken =:resettoken ");
		createQuery.setParameter("resettoken", token);
		List<User> users = createQuery.list();
		transaction.commit();
		session.close();
		return users!=null?users.get(0):null;
	}

}
