package com.experience.queries;

import com.experience.entity.User;

public interface IQuery {

	public final String QUERY = "";
	
	public final String LOGIN_QUERY = " FROM "+User.class.getName()+" WHERE useremail= :useremail AND userpwd= :userpwd ";
	

}
