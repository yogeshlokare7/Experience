package com.experience.dao;

import java.util.List;

import com.experience.entity.User;

public interface UserDao {
	
	public final String USER_LIST_QUERY="from User";
	
	public List<User> getUsers() throws Exception;
	
	public User getUser(Integer id) throws Exception;
	
	public Integer saveUser(User user) throws Exception;
	
	public void updateUser(User user) throws Exception;
	
	public void deleteUser(User user) throws Exception;
	
	public User findUserByUseremail(String useremail) throws Exception;
	
	public User findUserByUsername(String username) throws Exception;

	public User findUserByResetToken(String token) throws Exception;
}
