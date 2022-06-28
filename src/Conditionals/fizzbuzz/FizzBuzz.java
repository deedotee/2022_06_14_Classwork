package Conditionals.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {

		int a=15;
		
		if (a % 2 == 0) {
			System.out.println("Fizz");
		}
		if (a%3 == 0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(a);
		}
		
	}

}
