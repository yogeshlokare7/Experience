package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Inventory;

@Service
public interface InventoryService {

	public Integer saveInventory(Inventory inventory) throws Exception;

	public Inventory updateInventory(Inventory inventory) throws Exception;

	public void deleteInventory(Inventory inventory) throws Exception;

	public Inventory getInventory(Integer inventoryId) throws Exception;

	public List<Inventory> getInventoryList() throws Exception;
	
}
