package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.FoodItems;

@Service
public interface FoodItemsService {

	public Integer saveFoodItems(FoodItems foodItems) throws Exception;

	public FoodItems updateFoodItems(FoodItems foodItems) throws Exception;

	public void deleteFoodItems(FoodItems foodItems) throws Exception;

	public FoodItems getFoodItems(Integer foodItemsId) throws Exception;

	public List<FoodItems> getFoodItemsList() throws Exception;
	
}
