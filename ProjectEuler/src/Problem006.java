/**
 * 
 * @author JGreeny
 *
 * @problem Project Euler Problem 6:
 * 			The sum of the squares of the first ten natural numbers is,
 * 			1^2 + 2^2 + ... + 10^2 = 385
 * 			The square of the sum of the first ten natural numbers is,
 * 			(1 + 2 + ... + 10)^2 = 552 = 3025
 * 			Hence the difference between the sum of the squares of the first ten
 * 			natural numbers and the square of the sum is 3025 - 385 = 2640.
 * 			Find the difference between the sum of the squares of the first one
 * 			hundred natural numbers and the square of the sum.
 *			
 * @solution Brute force....
 */

public class Problem006 {
	public static void main(String[] args) {
		long somOSq = 0L,
			 sqOSm = 0L,
			 diff = 0L;
		
		for (int i = 1; i <= 100; i++) {
			sqOSm += i;
			somOSq += (i * i);
		}
		
		diff = (sqOSm * sqOSm) - somOSq;
		
		System.out.println(diff);
	}
}
