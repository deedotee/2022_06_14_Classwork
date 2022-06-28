package com.qa.challenges.garageretry;

//Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). 
//Each derived class should have its own attributes in addition to the normal Vehicle attributes.

public class Car extends Vehicle {
	
	// add Car specific attributes as private attributes at the top of the class 
	public String seatFabric;
	public boolean sunRoof;
	private String type = "Car";
	
	public Car(String name, String colour, int engineSize, String seatFacric, boolean sunRoof) { // manually include child attributes in the auto-generated constructor 
		super(name, colour, engineSize);
		this.seatFabric = seatFabric; // manually add this dot property for child properties 
		this.sunRoof = sunRoof; // manually add this dot property for child properties 
	}

	@Override
	public void calculateBill() {
		System.out.println("The bill is £10");
	}
	
	
}
