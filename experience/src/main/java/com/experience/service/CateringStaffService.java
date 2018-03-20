package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.CateringStaff;

@Service
public interface CateringStaffService {

	public Integer saveCateringStaff(CateringStaff cateringStaff) throws Exception;

	public CateringStaff updateCateringStaff(CateringStaff cateringStaff) throws Exception;

	public void deleteCateringStaff(CateringStaff cateringStaff) throws Exception;

	public CateringStaff getCateringStaff(Integer cateringStaffId) throws Exception;

	public List<CateringStaff> getCateringStaffList() throws Exception;
	
}
