package com.experience.dao;

import java.util.List;

import com.experience.entity.Inventory;

public interface InventoryDao {

	public Integer saveInventory(Inventory inventory) throws Exception;

	public Inventory updateInventory(Inventory inventory) throws Exception;

	public void deleteInventory(Inventory inventory) throws Exception;

	public Inventory getInventory(Integer inventoryId) throws Exception;

	public List<Inventory> getInventoryList() throws Exception;
	
}
