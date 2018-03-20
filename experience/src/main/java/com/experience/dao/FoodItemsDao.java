package com.experience.dao;

import java.util.List;

import com.experience.entity.FoodItems;

public interface FoodItemsDao {
	
	public Integer saveFoodItems(FoodItems foodItems) throws Exception;

	public FoodItems updateFoodItems(FoodItems foodItems) throws Exception;

	public void deleteFoodItems(FoodItems foodItems) throws Exception;

	public FoodItems getFoodItems(Integer foodItemsId) throws Exception;

	public List<FoodItems> getFoodItemsList() throws Exception;

}
