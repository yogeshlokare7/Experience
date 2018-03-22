package com.experience.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.dao.UserDao;
import com.experience.entity.User;
import com.experience.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;

	public List<User> getUsers() throws Exception {
		return dao.getUsers();
	}

	public User getUser(Integer id) throws Exception {
		return dao.getUser(id);
	}

	public Integer saveUser(User user) throws Exception {
		return dao.saveUser(user);
	}

	public void updateUser(User user) throws Exception {
		dao.updateUser(user);
	}

	public void deleteUser(User user) throws Exception {
		dao.deleteUser(user);
	}

	public User findUserByUseremail(String useremail) throws Exception {
		return dao.findUserByUseremail(useremail);
	}

	public User loginUser(String username, String password) {
		 User user = null;
		try {
			user = this.findUserByUsername(username);
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(user!=null && user.getUserpwd().equals(password)) {
			return user;
		}
		return null;
	}

	public User findUserByResetToken(String token) throws Exception {
		// TODO Auto-generated method stub
		return dao.findUserByResetToken(token);
	}

	public User findUserByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		return dao.findUserByUsername(username);
	}

}