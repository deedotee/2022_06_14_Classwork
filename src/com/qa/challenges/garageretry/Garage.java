package com.qa.challenges.garageretry;

import java.util.ArrayList;
import java.util.List;

// Using a List<> implementation, store all your Vehicles in a Garage class
// Create a method in Garage that iterates through each Vehicle, 
// calculating a bill for each type of Vehicle in a different way, 
// depending on the type of Vehicle it is (this does not need to be complex).

public class Garage {

	// First create an object of the List class
	// Shortcut to import packages: sift + command + o
	// Because all children share Vehicle parent, use vehicle as the datatype
	
	
	private List<Vehicle> VehicleArray = new ArrayList<>();
	
	//in order to store vehicles, they need to be made - need to make them in runner. 
	// However, we don't make vehicle objects - it is used to inherit properties
	// we should be making objects from the children 
	
	
	// why can't i now do this?
	// VehicleArray.add(Car);
	// VehicleArray.add(Bus);
	// VehicaleArray.add(Train);
	
	// create a method called add to add each element in the ArrayList to the List
	
	public void add(Vehicle input) { // create method called add, which populates the arratlist called VehicleArray
	VehicleArray.add(input);
		
	}
	
	// Create a method in Garage that iterates through each Vehicle, calculating a bull for each type 	
	// why doesn't this take an input parameter?
	public void calculateBill () {
		for (Vehicle vehicle : VehicleArray) {
			vehicle.calculateBill();
	}
	
}
	
}

