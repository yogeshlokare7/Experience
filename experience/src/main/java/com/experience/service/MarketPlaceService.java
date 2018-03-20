package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.MarketPlace;

@Service
public interface MarketPlaceService {
	
	public Integer saveMarketPlace(MarketPlace marketPlace) throws Exception;

	public MarketPlace updateMarketPlace(MarketPlace marketPlace) throws Exception;

	public void deleteMarketPlace(MarketPlace marketPlace) throws Exception;

	public MarketPlace getMarketPlace(Integer marketPlaceId) throws Exception;

	public List<MarketPlace> getMarketPlaceList() throws Exception;
	
}
