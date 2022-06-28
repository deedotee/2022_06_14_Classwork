package com.qa.challenges.garage;

public class Speedboat extends Vehicle {
	
	private String waterType = "River";
	private int noCabins;
	
	// if there is a constant in the parent class,
	// does it need to go into either the parent or child constructor
	// and does it need a getter
	public Speedboat(String colour, String make, int price, String type, String waterType, int noCabins) {
		super(colour, make, price, "Speedboat"); // what is super doing? 
		this.waterType = waterType;
	}

}
