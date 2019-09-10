package com.metallica.microservices.marketdataservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.metallica.microservices.marketdataservice.bean.MarketPrice;

@RestController
public class MarketController {
	
	List<MarketPrice> marketPriceList=new ArrayList<MarketPrice>(Arrays.asList(new MarketPrice(1,"AL",1870.5), new MarketPrice(1,"BA",1950.5)));
	
	@GetMapping("/market-price/for/{commodity}")
	public Optional<MarketPrice> retrieveMarketPrice(@PathVariable String commodity)
	{
		return marketPriceList.stream().filter(o -> o.getCommodity().equals(commodity)).findFirst();	
	}

}
