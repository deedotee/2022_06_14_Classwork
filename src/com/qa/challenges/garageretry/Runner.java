package com.qa.challenges.garageretry;

// 1.Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). 
// Each derived class should have its own attributes in addition to the normal Vehicle attributes.

// 2. Using a List<> implementation, store all your Vehicles in a Garage class.

// 3. Create a method in Garage that iterates through each Vehicle, 
//calculating a bill for each type of Vehicle in a different way, 
// depending on the type of Vehicle it is (this does not need to be complex).

public class Runner {

	public static void main(String[] args) {
		
		// After creating base vehicle class and derived classes, create instances in the runner as per below 
		Car car = new Car ("Mazda", "red", 2, "leather", false);
		Bus bus = new Bus("Metroline", "yellow", 2, 20, 30);
		Train train = new Train("Tube", "black", 24, 8, "Northern");
		
		// After creating the add method in the Garage class, create an object of the Garage class in order 
		// to be able to call the garage method on the vehicles 
		
		Garage garage = new Garage();
		
		garage.add(car);
		garage.add(bus);
		garage.add(train);
		
// Create a method in Garage that iterates through each Vehicle, 
//calculating a bill for each type of Vehicle in a different way, 
// depending on the type of Vehicle it is (this does not need to be complex).	

		garage.calculateBill();		

	}

}
