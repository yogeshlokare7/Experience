package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.FoodItemsDao;
import com.experience.entity.FoodItems;
import com.experience.service.FoodItemsService;

@Service
public class FoodItemsServiceImpl implements FoodItemsService{

	@Autowired
	protected FoodItemsDao foodItemsDao;

	public Integer saveFoodItems(FoodItems foodItems) throws Exception {
		return foodItemsDao.saveFoodItems(foodItems);
	}

	public FoodItems updateFoodItems(FoodItems foodItems) throws Exception {
		return foodItemsDao.updateFoodItems(foodItems);
	}

	public void deleteFoodItems(FoodItems foodItems) throws Exception {
		foodItemsDao.deleteFoodItems(foodItems);
	}

	public FoodItems getFoodItems(Integer foodItemsId) throws Exception {
		return foodItemsDao.getFoodItems(foodItemsId);
	}

	public List<FoodItems> getFoodItemsList() throws Exception {
		return foodItemsDao.getFoodItemsList();
	}
	
}
