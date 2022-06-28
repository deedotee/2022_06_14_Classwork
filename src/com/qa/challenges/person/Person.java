package com.qa.challenges.person;

public class Person {

	private String name;
	private int age;
	private String jobTitle;
	
	
	// create a constructor because this is an object
	public Person (String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	// encapsulation: variables are private, and have getters and setters
	
	public String getName () {
		return name;
	}
	
	public int getAge () {
		return age;
	}
	
	public String jobTitle () {
		return jobTitle;
	}
		
	// right click > source > generate To String, select all applicable variables (not methods)

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}
	
}
