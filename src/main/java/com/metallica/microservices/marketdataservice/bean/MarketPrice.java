package com.metallica.microservices.marketdataservice.bean;

public class MarketPrice {
private int id;
private String commodity;
private double price;

protected MarketPrice()
{
	
}

public MarketPrice(int id, String commodity, double price) {
	super();
	this.id = id;
	this.commodity = commodity;
	this.price = price;
}

public int getId() {
	return id;
}
public String getCommodity() {
	return commodity;
}
public double getPrice() {
	return price;
}

	
}
