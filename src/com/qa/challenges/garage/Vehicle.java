package com.qa.challenges.garage;

public class Vehicle {

	private String colour;
	private String make;
	private int price;
	private String type;
	
	public Vehicle (String  colour, String make, int price, String type) {
		this.colour = colour;
		this.make = make;
		this.price = price;
		this.type = type; 
	}

	public String getColour () {
		return colour;
	}
	
	public String getMake () {
		return make;
	}
	
	public int getPrice () {
		return price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
