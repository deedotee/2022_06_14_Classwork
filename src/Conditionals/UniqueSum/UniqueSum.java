package Conditionals.UniqueSum;

public class UniqueSum {

	int int1;
	int int2;
	int int3;
	
	
	public UniqueSum (int int1, int int2, int int3) {
		this.int1 = int1;
		this.int2 = int2;
		this.int3 = int3;
	}
	
	public void UniqueAdd() {
	
	if (int1 - int2 != 0) {
		int1 = int1;
	}
	else {
		int1 = 0;
	}
	
	if (int1 - int3 != 0) {
		int1 = int1;
	}
	else {
		int1 = 0;
	}
	
	if (int2 - int3 != 0) {
		int2 =  int2;
	}
	else {
		int2 = 0;
	}
	
	int UniqueResult = int1 + int2 + int3;
	System.out.println(UniqueResult);
	
}
}

