package com.experience.dao;

import java.util.List;

import com.experience.entity.FoodTypes;

public interface FoodTypesDao {
	
	public Integer saveFoodTypes(FoodTypes foodTypes) throws Exception;

	public FoodTypes updateFoodTypes(FoodTypes foodTypes) throws Exception;

	public void deleteFoodTypes(FoodTypes foodTypes) throws Exception;

	public FoodTypes getFoodTypes(Integer foodTypesId) throws Exception;

	public List<FoodTypes> getFoodTypesList() throws Exception;
	
}
