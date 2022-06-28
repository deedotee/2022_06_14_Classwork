package com.qa.challenges.garageretry;

//Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). 
//Each derived class should have its own attributes in addition to the normal Vehicle attributes.

public class Bus extends Vehicle {

	private int noStops;
	private int routeNumber;
	private String type = "bus";
	
	
	// To generate constructor: RC > generate constructor > select child properties and parent properties 
	
	public Bus(String name, String colour, int engineSize, int noStops, int routeNumber) {
		super(name, colour, engineSize);
		this.noStops = noStops;
		this.routeNumber = routeNumber;
	}


	public int getNoStops() {
		return noStops;
	}


	public void setNoStops(int noStops) {
		this.noStops = noStops;
	}


	public int getRouteNumber() {
		return routeNumber;
	}


	public void setRouteNumber(int routeNumber) {
		this.routeNumber = routeNumber;
	}
	
	@Override
	public void calculateBill () {
		System.out.println("The bill is £20");
	}
	
	
}
