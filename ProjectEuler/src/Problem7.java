/**
 * 
 * @author JGreeny
 *
 * @problem Project Euler Problem 7:
 * 			By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * 			we can see that the 6th prime is 13.
 * 
 * 			What is the 10 001st prime number?
 *			
 * @solution Rather messy way of doing it, but....
 * 
 * 			 Using the same algorithm from problem 3 to find the largest prime factor of each number,
 * 			 test each number for primeness - if the largest prime factor is the number itself, then the
 * 			 number is prime. Simply increment a counter each time a prime number is found and once the
 *			 counter reaches the desired term, print out the last tested number.
 */

public class Problem7 {
	public static void main(String[] args) {
		int curNum = 1,
			prime = 0,
			maxPrime = 10001;
		
		while (prime < maxPrime) {
			curNum++;
			
			if (primeFact(curNum))
				prime++;
		}
		
		System.out.println(curNum);
	}
	
	public static boolean primeFact(int num) {
		int div = 2;
		int number = num;
		
		while (number > 1) {
			if ((number % div) == 0) {
				number /= div;
				div--;
			}
			div++;
		}
		
		if (div == num)
			return true;
			
		else
			return false;
	}
}
