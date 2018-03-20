package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.FoodTypesDao;
import com.experience.entity.FoodTypes;
import com.experience.service.FoodTypesService;

@Service
public class FoodTypesServiceImpl  implements FoodTypesService{


	@Autowired
	protected FoodTypesDao foodTypesDao;

	public Integer saveFoodTypes(FoodTypes foodTypes) throws Exception {
		return foodTypesDao.saveFoodTypes(foodTypes);
	}

	public FoodTypes updateFoodTypes(FoodTypes foodTypes) throws Exception {
		return foodTypesDao.updateFoodTypes(foodTypes);
	}

	public void deleteFoodTypes(FoodTypes foodTypes) throws Exception {
		foodTypesDao.deleteFoodTypes(foodTypes);
	}

	public FoodTypes getFoodTypes(Integer foodTypesId) throws Exception {
		return foodTypesDao.getFoodTypes(foodTypesId);
	}

	public List<FoodTypes> getFoodTypesList() throws Exception {
		return foodTypesDao.getFoodTypesList();
	}
	
}
