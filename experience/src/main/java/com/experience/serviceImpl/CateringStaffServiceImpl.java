package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.CateringStaffDao;
import com.experience.entity.CateringStaff;
import com.experience.service.CateringStaffService;

@Service
public class CateringStaffServiceImpl  implements CateringStaffService{
	
	@Autowired
	protected CateringStaffDao cateringStaffDao;

	public Integer saveCateringStaff(CateringStaff cateringStaff) throws Exception {
		return cateringStaffDao.saveCateringStaff(cateringStaff);
	}

	public CateringStaff updateCateringStaff(CateringStaff cateringStaff) throws Exception {
		return cateringStaffDao.updateCateringStaff(cateringStaff);
	}

	public void deleteCateringStaff(CateringStaff cateringStaff) throws Exception {
		cateringStaffDao.deleteCateringStaff(cateringStaff);
	}

	public CateringStaff getCateringStaff(Integer cateringStaffId) throws Exception {
		return cateringStaffDao.getCateringStaff(cateringStaffId);
	}

	public List<CateringStaff> getCateringStaffList() throws Exception {
		return cateringStaffDao.getCateringStaffList();
	}
	
	
}
