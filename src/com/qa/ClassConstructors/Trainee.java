package com.qa.ClassConstructors;

public class Trainee {
	public String name;
	public String pathway;
	public boolean hired = false;
	
	public Trainee(String name, String pathway) {
		this.name = name;
		this.pathway = pathway;
	}
	
	public Trainee(String name, String pathway, boolean hired) {
		this.name = name;
		this.pathway = pathway;
		this.hired = hired;
	}
}
	
	/* create an object of the Trainee class, and initialise class parameters using the "this" keyword
	public Trainee() {
		this.name = "Bob";
		this.pathway = "Software Development";
	}
	
	// example including parameters
	
	public Trainee (String name, String pathway) {
		this.name = name;
		this.pathway = pathway;
	}
}
*/
