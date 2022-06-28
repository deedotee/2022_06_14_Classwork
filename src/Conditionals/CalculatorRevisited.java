package Conditionals;

public class CalculatorRevisited {
	
//Calculator Revisited
//Edit the division method in the Calculator class, the sum should only execute if t
//The first parameter is smaller than the second, 
//otherwise it prints out a message saying that the division cannot be performed.

	public static void main(String[] args) {
		
	double dbl1 = 2.0;
	double dbl2 = 1.0;
	
	if (dbl1 < dbl2) {
		Divide DivisionCalc = new Divide();
		DivisionCalc.DivideCalc(dbl2, dbl1);
	}
	else {
			System.out.println("The division cannot be performed");
		}
		
	
}
}