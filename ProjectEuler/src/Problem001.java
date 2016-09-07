/**
 * 
 * @author JGreeny
 *
 * @problem Project Euler Problem 1:
 * 			If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * 			The sum of these multiples is 23.
 *			Find the sum of all the multiples of 3 or 5 below 1000.
 *			
 * @solution Find all of the multiples of 3 below 1000, and add them.
 * 			 Find all of the multiples of 5 below 1000, and add them to the total.
 * 			 Find all of the multiples of 3 * 5, and subtract them from the total (since
 * 			 they have all been double counted).
 */

public class Problem001 {
	
	public static void main(String[] args) {
		int max = 1000,
			total = 0;
		
		for (int i = 3; i < max; i += 3) {
			total += i;
		}
		
		for (int i = 5; i < max; i += 5) {
			total += i;
		}
		
		for (int i = 15; i < max; i += 15) {
			total -= i;
		}
		
		System.out.println(total);
	}
}
