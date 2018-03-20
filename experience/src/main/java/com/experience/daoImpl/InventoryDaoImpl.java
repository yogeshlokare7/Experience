package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.InventoryDao;
import com.experience.entity.Inventory;

@Repository
public class InventoryDaoImpl extends EntityTransactionImpl<Inventory> implements InventoryDao{
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveInventory(Inventory inventory) throws Exception {
		return saveEntity(inventory, sessionFactory);
	}

	public Inventory updateInventory(Inventory inventory) throws Exception {
		return updateEntity(inventory, sessionFactory);
	}

	public void deleteInventory(Inventory inventory) throws Exception {
		deleteEntity(inventory, sessionFactory);
	}

	public Inventory getInventory(Integer inventoryId) throws Exception {
		return getEntity(new Inventory(), inventoryId, sessionFactory);
	}

	public List<Inventory> getInventoryList() throws Exception {
		return getEntityList(new Inventory(), sessionFactory);
	}

}
