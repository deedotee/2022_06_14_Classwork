package JavaOperators.Results;

public class ResultsMethod {
	
double physicsMark;
double chemistryMark;
double biologyMark;
double totalMark;
double percentageMark;
	
public ResultsMethod (double physicsMark, double chemistryMark, double biologyMark) {
this.physicsMark = physicsMark;
this.chemistryMark = chemistryMark;
this.biologyMark = biologyMark; 
this.totalMark = this.physicsMark + this.chemistryMark + this.biologyMark;
}
	
	public void resultDisplay () {
		System.out.println("Your physics mark is: " + this.physicsMark);
		System.out.println("Your chemistry mark is: " + this.chemistryMark);
		System.out.println("Your biology mark is: " + this.biologyMark);
		System.out.println("Your total mark is: " + this.totalMark);
			
	}
	
	public void resultTotalPercentage () {
		double percentageMark = ((this.totalMark / 450)*100);
		System.out.println(percentageMark);
	}
	
	

}
