package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.PresenterProfileDao;
import com.experience.entity.PresenterProfile;
import com.experience.service.PresenterProfileService;

@Service
public class PresenterProfileServiceImpl implements PresenterProfileService{

	
	@Autowired
	protected PresenterProfileDao presenterProfileDao;

	public Integer savePresenterProfile(PresenterProfile presenterProfile) throws Exception {
		return presenterProfileDao.savePresenterProfile(presenterProfile);
	}

	public PresenterProfile updatePresenterProfile(PresenterProfile presenterProfile) throws Exception {
		return presenterProfileDao.updatePresenterProfile(presenterProfile);
	}

	public void deletePresenterProfile(PresenterProfile presenterProfile) throws Exception {
		presenterProfileDao.deletePresenterProfile(presenterProfile);
	}

	public PresenterProfile getPresenterProfile(Integer presenterProfileId) throws Exception {
		return presenterProfileDao.getPresenterProfile(presenterProfileId);
	}

	public List<PresenterProfile> getPresenterProfileList() throws Exception {
		return presenterProfileDao.getPresenterProfileList();
	}
}
