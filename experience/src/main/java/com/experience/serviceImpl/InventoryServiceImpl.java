package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.InventoryDao;
import com.experience.entity.Inventory;
import com.experience.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{
	
	@Autowired
	protected InventoryDao inventoryDao;

	public Integer saveInventory(Inventory inventory) throws Exception {
		return inventoryDao.saveInventory(inventory);
	}

	public Inventory updateInventory(Inventory inventory) throws Exception {
		return inventoryDao.updateInventory(inventory);
	}

	public void deleteInventory(Inventory inventory) throws Exception {
		inventoryDao.deleteInventory(inventory);;
	}

	public Inventory getInventory(Integer inventoryId) throws Exception {
		return inventoryDao.getInventory(inventoryId);
	}

	public List<Inventory> getInventoryList() throws Exception {
		return inventoryDao.getInventoryList();
	}

}
