package com.qa.iteration;

public class Coins {

	public static void main(String[] args) {
		double cost = 20.00;
		double amount = 4.58;
		double change = cost - amount;
		
		double tenChange = change / 10;
				System.out.println("tenChange: "+tenChange);
				
		double fiveChange = tenChange / 5;
		System.out.println("fiveChange: "+fiveChange);
		
		
		

	}

}
