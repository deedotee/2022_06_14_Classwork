package com.qa.challenges.garageretry;

//Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). 
//Each derived class should have its own attributes in addition to the normal Vehicle attributes.

public class Vehicle {
	
	// start with:
	// 1. Determining 3 attributes common to all vehicles
	// 2. Creating a constructor to initialise these properties
	// 3. Creating getters and setters 
	
	private String name;
	private String colour;
	private int engineSize;
	
	// To auto generate constructor: RC > source > generate constructor 
	
	public Vehicle(String name, String colour, int engineSize) {
		super();
		this.name = name;
		this.colour = colour;
		this.engineSize = engineSize;
	}

	// To auto-generate getters and setters: RC > source > generate getters and setters 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getEngineSize() {
		return engineSize;
	}


	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	
	// RC > source > generateToString
	// Notice that because the variables are private, you need to use getters/setters for parent attributes
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", colour=" + colour + ", engineSize=" + engineSize + ", getName()="
				+ getName() + ", getColour()=" + getColour() + ", getEngineSize()=" + getEngineSize() + "]";
	}
	
	// create public getter and setter methods
	
	
	// create calculateBill method in Vehicle NOT to use in vehicle class, 
	// but so that it can be inherited to children 
	
	public void calculateBill () {
		System.out.println(0);
		
	}

}
