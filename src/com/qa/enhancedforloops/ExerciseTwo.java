package com.qa.enhancedforloops;

import java.util.ArrayList;
import java.util.List;

// Create an array of integers 1-20 and iterate through it, 
// using an enhanced for loop, square, and then print each value.

public class ExerciseTwo {

	// ArrayList syntax: public List<String> meat = new ArrayList<>();.
		
	public static void main(String[] args) {
		
		
	List<Integer> intArrayList = new ArrayList<>();
	
	for (Integer value : intArrayList) {
		
		value = value * value;
		System.out.println(value);
		
	}
	
	
	
	
	

	}

}
