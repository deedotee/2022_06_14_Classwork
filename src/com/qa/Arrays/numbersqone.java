package com.qa.Arrays;


//Create a method that takes a number 10-99, 
// and adds the two digits together for example 74 = 7 + 4 = 11.


public class numbersqone {
	
	private int num;
	private String str;
	
	public numbersqone(int num) {
		super();
		this.num = num;
	}
	
	public int getNum() {
			return num;
	}

	public void setNum(int num) {
			this.num = num;
	}	
		
	
	public void addnum(int num) {
		// convert the int to a string
		
		String str = String.valueOf(num);
		System.out.println(str);
		
		// split the sting into char array
		char[] charArray = str.toCharArray();
		System.out.println(charArray[0] +","+charArray[1]);		
		
		for (int i=0; i< charArray.length; i++) {
			
			int j = Integer.parseInt(String.valueOf(charArray[i]));

			System.out.println(j);
		}
		
		
		// convert the char array to an int array
		// add each element of the int array together 
	}


	}

