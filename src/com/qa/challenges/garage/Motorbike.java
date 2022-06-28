package com.qa.challenges.garage;

public class Motorbike extends Vehicle {
	
	private String crew;
	private String helmetColour;
	
	
	// Only point of a constructor is to customise objects 
	public Motorbike(String colour, String make, int price, String crew, String helmetColour) {
		super(colour, make, price, "Motorbike");
		this.crew = crew;
		this.helmetColour = helmetColour;
	}

	
}
