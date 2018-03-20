package com.experience.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.LoginDao;

@Repository
public class LoginDaoImpl  implements LoginDao {

	@Autowired
	protected SessionFactory sessionFactory;

	public boolean login(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


}
