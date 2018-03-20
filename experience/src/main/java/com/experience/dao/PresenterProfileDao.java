package com.experience.dao;

import java.util.List;

import com.experience.entity.PresenterProfile;

public interface PresenterProfileDao {

	public Integer savePresenterProfile(PresenterProfile presenterProfile) throws Exception;

	public PresenterProfile updatePresenterProfile(PresenterProfile presenterProfile) throws Exception;

	public void deletePresenterProfile(PresenterProfile presenterProfile) throws Exception;

	public PresenterProfile getPresenterProfile(Integer presenterProfileId) throws Exception;

	public List<PresenterProfile> getPresenterProfileList() throws Exception;
	
}
