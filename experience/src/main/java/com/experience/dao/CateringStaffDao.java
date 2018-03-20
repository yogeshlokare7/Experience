package com.experience.dao;

import java.util.List;

import com.experience.entity.CateringStaff;

public interface CateringStaffDao {

	public Integer saveCateringStaff(CateringStaff cateringStaff) throws Exception;

	public CateringStaff updateCateringStaff(CateringStaff cateringStaff) throws Exception;

	public void deleteCateringStaff(CateringStaff cateringStaff) throws Exception;

	public CateringStaff getCateringStaff(Integer cateringStaffId) throws Exception;

	public List<CateringStaff> getCateringStaffList() throws Exception;
	
}
