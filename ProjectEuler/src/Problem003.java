/**
 * 
 * @author JGreeny
 *
 * @problem Project Euler Problem 3:
 * 			The prime factors of 13195 are 5, 7, 13 and 29.
 * 			What is the largest prime factor of the number 600851475143 ?
 *			
 * @solution Factor the number, by breaking it down into smaller prime factors.
 * 			 That is, divide it by prime factors in a loop.
 * 			 The last factor that the number is divisible by is the largest prime factor.
 */

public class Problem003 {
	
	public static void main(String[] agrs) {
		long number = 600851475143L;
		int div = 2;
		
		while (number > 1) {
			if ((number % div) == 0) {
				number /= div;
				div--;
			}
			div++;
		}
		
		System.out.println(div);
	}
}
