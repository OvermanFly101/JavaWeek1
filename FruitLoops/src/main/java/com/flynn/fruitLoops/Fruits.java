package com.flynn.fruitLoops;

public class Fruits {
	private String name;
	private double price;
	
	public Fruits() {
		
	}
	
	public Fruits(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String aName) {
		this.name = aName;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double aPrice) {
		this.price = aPrice;
	}
}
