package com.experience.dao;

import java.util.List;

import com.experience.entity.ItemDetails;

public interface ItemDetailsDao {

	public Integer saveItemDetails(ItemDetails itemDetails) throws Exception;

	public ItemDetails updateItemDetails(ItemDetails itemDetails) throws Exception;

	public void deleteItemDetails(ItemDetails itemDetails) throws Exception;

	public ItemDetails getItemDetails(Integer itemDetailsId) throws Exception;

	public List<ItemDetails> getItemDetailsList() throws Exception;
	
}
