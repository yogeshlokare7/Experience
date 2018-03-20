package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.ItemDetailsDao;
import com.experience.entity.ItemDetails;

@Repository
public class ItemDetailsDaoImpl extends EntityTransactionImpl<ItemDetails> implements ItemDetailsDao {
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveItemDetails(ItemDetails itemDetails) throws Exception {
		return saveEntity(itemDetails, sessionFactory);
	}

	public ItemDetails updateItemDetails(ItemDetails itemDetails) throws Exception {
		return updateEntity(itemDetails, sessionFactory);
	}

	public void deleteItemDetails(ItemDetails itemDetails) throws Exception {
		deleteEntity(itemDetails, sessionFactory);
	}

	public ItemDetails getItemDetails(Integer itemDetailsId) throws Exception {
		return getEntity(new ItemDetails(), itemDetailsId, sessionFactory);
	}

	public List<ItemDetails> getItemDetailsList() throws Exception {
		return getEntityList(new ItemDetails(), sessionFactory);
	}
	
	

}
