package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.ItemDetailsDao;
import com.experience.entity.ItemDetails;
import com.experience.service.ItemDetailsService;

@Service
public class ItemDetailsServiceImpl implements ItemDetailsService{
	
	@Autowired
	protected ItemDetailsDao itemDetailsDao;

	public Integer saveItemDetails(ItemDetails itemDetails) throws Exception {
		return itemDetailsDao.saveItemDetails(itemDetails);
	}

	public ItemDetails updateItemDetails(ItemDetails itemDetails) throws Exception {
		return itemDetailsDao.updateItemDetails(itemDetails);
	}

	public void deleteItemDetails(ItemDetails itemDetails) throws Exception {
		itemDetailsDao.deleteItemDetails(itemDetails);
	}

	public ItemDetails getItemDetails(Integer itemDetailsId) throws Exception {
		return itemDetailsDao.getItemDetails(itemDetailsId);
	}

	public List<ItemDetails> getItemDetailsList() throws Exception {
		return itemDetailsDao.getItemDetailsList();
	}
	
	

}
