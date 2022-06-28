package com.qa.challenges.garage;

public class Car extends Vehicle {

	private int noSeats;
	private String wheelBrand; 
	
	// Car needs it's own properties also - see above
	// When extend from parent class, MUST create a constructor. 
	// Constructor used to customise objects. However the type never changes, therefore doesn't need to go into the constructor. 
	// Extend from a parent and then add more properties that should vary in instances of Cars
	// Does every single variable need a getter and setter? When is a getter needed and when is a setter needed?
	public Car(String colour, String make, int price, String type, int noSeats, String wheelBrand) {
		super(colour, make, price, "Car");
		this.noSeats = noSeats; // must add "thisdot" for each additional attribute - but how to do this for type which is a constant? 	
		this.wheelBrand = "wheelBrand";
	}

}
