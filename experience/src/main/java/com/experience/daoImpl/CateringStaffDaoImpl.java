package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.CateringStaffDao;
import com.experience.entity.CateringStaff;

@Repository
public class CateringStaffDaoImpl extends EntityTransactionImpl<CateringStaff> implements CateringStaffDao{
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveCateringStaff(CateringStaff cateringStaff) throws Exception {
		return saveEntity(cateringStaff, sessionFactory);
	}

	public CateringStaff updateCateringStaff(CateringStaff cateringStaff) throws Exception {
		return updateEntity(cateringStaff, sessionFactory);
	}

	public void deleteCateringStaff(CateringStaff cateringStaff) throws Exception {
		deleteEntity(cateringStaff, sessionFactory);
	}

	public CateringStaff getCateringStaff(Integer cateringStaffId) throws Exception {
		return getEntity(new CateringStaff(), cateringStaffId, sessionFactory);
	}

	public List<CateringStaff> getCateringStaffList() throws Exception {
		return getEntityList(new CateringStaff(), sessionFactory);
	}
	
	
}
