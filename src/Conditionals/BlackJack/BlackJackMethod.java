package Conditionals.BlackJack;

public class BlackJackMethod {
	
	
//BlackJack
//Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. 
//If they both go over 21 then return 0.
//
//play (10, 21) -> 21
//play (20, 18) -> 20
//play (1, 22) -> 1
//play (22, 23) -> 0	
	
	
public void BlackJackResult (int intone, int intwo) {
		int intonediff = Math.max(0, 21 - intone);
		int intwodiff = Math.max(0, 21 - intwo);
		
		if (Math.min(intonediff, intwodiff) == intonediff) {
			System.out.println("intone: " + intone);
		}
		else if (Math.min(intonediff, intwodiff) == intwodiff) {
			System.out.println("intwo: "+ intwo);
		}
		else {
			System.out.println("0");
		}
}
}
