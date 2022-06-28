package com.qa.challenges.garageretry;

//Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). 
//Each derived class should have its own attributes in addition to the normal Vehicle attributes.

public class Train  extends Vehicle {

	private int noCarriages;
	private String tubeLine;
	
	public Train(String name, String colour, int engineSize, int noCarriages, String tubeLine) {
		super(name, colour, engineSize);
		this.noCarriages = noCarriages;
		this.tubeLine = tubeLine;
	}

	public int getNoCarriages() {
		return noCarriages;
	}

	public void setNoCarriages(int noCarriages) {
		this.noCarriages = noCarriages;
	}

	public String getTubeLine() {
		return tubeLine;
	}

	public void setTubeLine(String tubeLine) {
		this.tubeLine = tubeLine;
	}
	
	@Override
	public void calculateBill () {
	System.out.println("The bill is £30");
	}
}
