package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.ItemDetails;

@Service
public interface ItemDetailsService {

	public Integer saveItemDetails(ItemDetails itemDetails) throws Exception;

	public ItemDetails updateItemDetails(ItemDetails itemDetails) throws Exception;

	public void deleteItemDetails(ItemDetails itemDetails) throws Exception;

	public ItemDetails getItemDetails(Integer itemDetailsId) throws Exception;

	public List<ItemDetails> getItemDetailsList() throws Exception;
	
}
