package com.experience.dao;

import java.util.List;

import com.experience.entity.MarketPlace;

public interface MarketPlaceDao {
	
	public Integer saveMarketPlace(MarketPlace marketPlace) throws Exception;

	public MarketPlace updateMarketPlace(MarketPlace marketPlace) throws Exception;

	public void deleteMarketPlace(MarketPlace marketPlace) throws Exception;

	public MarketPlace getMarketPlace(Integer marketPlaceId) throws Exception;

	public List<MarketPlace> getMarketPlaceList() throws Exception;
	
}
