package ResultsRevisited;

//Results Revisited
//Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.
//
//Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.
//
//eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84
//
//they would have an overall grade of 85.3% (Pass)
//
//but in this case the student would fail because their physics grade is 54% (Fail)
//
//Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.

public class ResultsRevisitedRunner {
	
	public static void main(String[] args) {

	double passMark = 0.6;
	
	double mark = 0.7;
	
	ResultsRevisitedMethod ResultInstance = new ResultsRevisitedMethod ();
	
	ResultInstance.Result(passMark, mark);
}	
}
