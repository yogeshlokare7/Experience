package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {

	@Column(name = "inventory_id")
	Integer inventoryId;

	@Column(name = "name")
	String name;

	@Column(name = "unit")
	String unit;

	@Column(name = "coast")
	double coast;

	@Column(name = "descrption")
	String desciption;

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getCoast() {
		return coast;
	}

	public void setCoast(double coast) {
		this.coast = coast;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
}
