/**
 * 
 */
package com.experience.daoImpl;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component
public class EntityTransactionImpl <T> {
	
	public Integer saveEntity(T object,SessionFactory sessionFactory)throws Exception{
		Session session = null;
		Transaction transaction = null;
		Integer primary = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			primary = (Integer) session.save(object);
			transaction.commit();
		}
		catch (Exception exception) {
			if(session!=null && transaction!=null) {
				transaction.rollback();
			}
			throw exception;
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return primary;
	}
	
	public Integer deleteEntity(T object,SessionFactory sessionFactory)throws Exception{
		Session session = null;
		Transaction transaction = null;
		Integer primary = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.delete(object);
			transaction.commit();
		}
		catch (Exception exception) {
			if(session!=null && transaction!=null) {
				transaction.rollback();
			}
			throw exception;
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return primary;
	}
	
	public T updateEntity(T object,SessionFactory sessionFactory) throws Exception{
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.update(object);
			transaction.commit();
			//session.close();
		}
		catch (Exception exception) {
			if(session!=null && transaction!=null) {
				transaction.rollback();
				//session.close();
			}
			throw exception;
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return object;
	}
	
	@SuppressWarnings("unchecked")
	public T getEntity(T object,Integer primary,SessionFactory sessionFactory)throws Exception{
		Session session = null;
		Transaction transaction = null;
		T find = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			find = (T) session.get(object.getClass(), primary);
			transaction.commit();
		}
		catch (Exception exception) {
			if(session!=null && transaction!=null) {
				transaction.rollback();
			}
			throw exception;
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return find;
	}

    @SuppressWarnings("unchecked")
	public List<T> getEntityList(T t, SessionFactory sessionFactory) throws Exception{
    	Session session = null;
		Transaction transaction = null;
		List<T> list = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			list = session.createQuery(" FROM "+t.getClass().getName()).list();
			transaction.commit();
			//session.close();
		}
		catch (Exception exception) {
			if(session!=null && transaction!=null) {
				transaction.rollback();
				//session.close();
			}
			throw exception;
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return list;
    }
    
    
    @SuppressWarnings("unchecked")
	public List<T> getEntityListFromCustomQuery(String query,Map<String, String> param,SessionFactory sessionFactory) throws Exception{
    	Session session = null;
		Transaction transaction = null;
		List<T> list = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Query createQuery = session.createQuery(query);
			for (Entry<String, String> entrySet : param.entrySet()) {
				createQuery.setParameter(entrySet.getKey(), entrySet.getKey());
			}
			list = createQuery.list();
			transaction.commit();
			session.close();
		}
		catch (Exception exception) {
			if(session!=null && transaction!=null) {
				transaction.rollback();
				session.close();
			}
			throw exception;
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return list;
    }
    
}
