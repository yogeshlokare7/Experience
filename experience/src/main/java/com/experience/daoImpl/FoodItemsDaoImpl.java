package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.FoodItemsDao;
import com.experience.entity.FoodItems;

@Repository
public class FoodItemsDaoImpl extends EntityTransactionImpl<FoodItems> implements FoodItemsDao {

	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveFoodItems(FoodItems foodItems) throws Exception {
		return saveEntity(foodItems, sessionFactory);
	}

	public FoodItems updateFoodItems(FoodItems foodItems) throws Exception {
		return updateEntity(foodItems, sessionFactory);
	}

	public void deleteFoodItems(FoodItems foodItems) throws Exception {
		deleteEntity(foodItems, sessionFactory);
	}

	public FoodItems getFoodItems(Integer foodItemsId) throws Exception {
		return getEntity(new FoodItems(), foodItemsId, sessionFactory);
	}

	public List<FoodItems> getFoodItemsList() throws Exception {
		return getEntityList(new FoodItems(), sessionFactory);
	}
	
	
}
