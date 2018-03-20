package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.FoodTypesDao;
import com.experience.entity.FoodTypes;

@Repository
public class FoodTypesDaoImpl extends EntityTransactionImpl<FoodTypes> implements FoodTypesDao {

	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveFoodTypes(FoodTypes foodTypes) throws Exception {
		return saveEntity(foodTypes, sessionFactory);
	}

	public FoodTypes updateFoodTypes(FoodTypes foodTypes) throws Exception {
		return updateEntity(foodTypes, sessionFactory);
	}

	public void deleteFoodTypes(FoodTypes foodTypes) throws Exception {
		deleteEntity(foodTypes, sessionFactory);
	}

	public FoodTypes getFoodTypes(Integer foodTypesId) throws Exception {
		return getEntity(new FoodTypes(), foodTypesId, sessionFactory);
	}

	public List<FoodTypes> getFoodTypesList() throws Exception {
		return getEntityList(new FoodTypes(), sessionFactory);
	}
	
}
