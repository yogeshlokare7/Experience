package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.FoodTypes;

@Service
public interface FoodTypesService {

	public Integer saveFoodTypes(FoodTypes foodTypes) throws Exception;

	public FoodTypes updateFoodTypes(FoodTypes foodTypes) throws Exception;

	public void deleteFoodTypes(FoodTypes foodTypes) throws Exception;

	public FoodTypes getFoodTypes(Integer foodTypesId) throws Exception;

	public List<FoodTypes> getFoodTypesList() throws Exception;
	
}
