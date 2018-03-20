package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="foor_items")
public class FoodItems {
	
	@Column(name = "food_items_id")
	Integer food_items_id;
	
	@Column(name = "item_name")
	String itemName;
	
	@Column(name = "item_type")
	String itemType;
	
	@Column(name = "item_menu")
	String itemMenu;
	
	@Column(name = "item_price")
	double itemPrice;
	
	@Column(name = "item_available")
	String itemAvailable;

	public Integer getFood_items_id() {
		return food_items_id;
	}

	public void setFood_items_id(Integer food_items_id) {
		this.food_items_id = food_items_id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemMenu() {
		return itemMenu;
	}

	public void setItemMenu(String itemMenu) {
		this.itemMenu = itemMenu;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemAvailable() {
		return itemAvailable;
	}

	public void setItemAvailable(String itemAvailable) {
		this.itemAvailable = itemAvailable;
	}
	
}
