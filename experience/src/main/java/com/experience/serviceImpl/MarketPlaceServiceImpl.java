package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.MarketPlaceDao;
import com.experience.entity.MarketPlace;
import com.experience.service.MarketPlaceService;

@Service
public class MarketPlaceServiceImpl implements MarketPlaceService{


	@Autowired
	protected MarketPlaceDao marketPlaceDao;

	public Integer saveMarketPlace(MarketPlace marketPlace) throws Exception {
		return marketPlaceDao.saveMarketPlace(marketPlace);
	}

	public MarketPlace updateMarketPlace(MarketPlace marketPlace) throws Exception {
		return marketPlaceDao.updateMarketPlace(marketPlace);
	}

	public void deleteMarketPlace(MarketPlace marketPlace) throws Exception {
		marketPlaceDao.deleteMarketPlace(marketPlace);
	}

	public MarketPlace getMarketPlace(Integer marketPlaceId) throws Exception {
		return marketPlaceDao.getMarketPlace(marketPlaceId);
	}

	public List<MarketPlace> getMarketPlaceList() throws Exception {
		return marketPlaceDao.getMarketPlaceList();
	}


}
