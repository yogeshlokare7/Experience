package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="food_types")
public class FoodTypes {
	
	@Column(name="food_types_id")
	Integer foodTypesId;
	
	@Column(name="food_types_id")
	String foodTypesName;

	public Integer getFoodTypesId() {
		return foodTypesId;
	}

	public void setFoodTypesId(Integer foodTypesId) {
		this.foodTypesId = foodTypesId;
	}

	public String getFoodTypesName() {
		return foodTypesName;
	}

	public void setFoodTypesName(String foodTypesName) {
		this.foodTypesName = foodTypesName;
	}
	
}
