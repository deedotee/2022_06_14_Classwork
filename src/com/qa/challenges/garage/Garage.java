package com.qa.challenges.garage;

//vehicle.getClass().getSimpleName() -> this will get you the class name as a String. 
//So if the vehicle is a Car you will get "Car". If the vehicle is a Van you will get "Van" etc.. 
//This can be used anywhere requiring you to check the 'type' :) 

import java.util.ArrayList;
import java.util.List;

import com.qa.challenges.garage.Vehicle;

public class Garage {

	private List <Vehicle> listOfVehicles = new ArrayList<>();
	
	public void add (Vehicle input) {
			listOfVehicles.add(input);
	}

	public void calculateBill () { // Do i need an input parameter? 
		for (Vehicle vehicle : listOfVehicles) { // vehicle needs type and a get type. 
			if( vehicle.getType() == "Car") {
				System.out.println(Car.getPrice); // ?? 
			}
			
	
			
			
		}
	}
}
