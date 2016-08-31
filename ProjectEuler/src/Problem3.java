/**
 * 
 * @author JGreeny
 *
 * @problem Project Euler Problem 3:
 * 			The prime factors of 13195 are 5, 7, 13 and 29.
 * 			What is the largest prime factor of the number 600851475143 ?
 *			
 * @solution Find the factors of the number.
 * 			 Note: only 1 through sqrt(600851475143) need to be tested.
 * 			 If a factor is found, test if its counterpart is a prime number.
 * 			 The first prime number found this way is the highest prime factor.
 */

public class Problem3 {
	
	public static void main(String[] agrs) {
		double number = 600851475143L,
			   numMax = Math.sqrt(number),
			   ref = 2L;
		
		while (ref <= numMax) {
			 if (isPrime(number / ref)) {
				 System.out.println(number / ref);
				 break;
			 }
			 else {
				 ref ++;
			 }
		}
		
	}
	
	public static boolean isPrime(double factor) {
		if (factor % 1 == 0) {
			
		}
		return true;
	}
}
