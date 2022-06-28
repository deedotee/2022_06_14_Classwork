package com.qa.enhancedforloops;

import java.util.ArrayList;
import java.util.List;

// Create an array of strings and iterate through it, printing each value to console, using an enhanced for loop.

public class ExerciseOne {

	public static void main(String[] args) {
	
	// ArrayList syntax: public List<String> meat = new ArrayList<>();. Remember to import List and ArrayList classes. 
		
	List<String> stringArray = new ArrayList<>();
	stringArray.add("Anoush");
	stringArray.add("Ajibola");
	stringArray.add("Harry");
	
	for (String value: stringArray) {
		System.out.println(value);
	}
	

		

	}

}
