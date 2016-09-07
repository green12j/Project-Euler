import java.math.BigInteger;
import java.util.ArrayList;

/**
 * 
 * @author JGreeny
 *
 * @problem Project Euler Problem 10:
 * 			The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 			Find the sum of all the primes below two million.
 * 			
 * @solution Rather messy way of doing it, but....
 * 
 * 			 Create a prime list from the given primes.
 * 			 Create a variable to hold the sum, initialized at 17 (given).
 * 			 Test all odd numbers for primeness (against the prime list).
 * 			 If prime > add to list and add to sum.
 * 
 *           Test all values below to 2,000,000.
 *           
 * @sideNote Lol...took forever to realize i was overflowing long int....
 */

public class Problem010 {
	private static ArrayList<Integer> primeList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		primeList.add(2);
		primeList.add(3);
		primeList.add(5);
		primeList.add(7);
		
		int max = 2000000;
		BigInteger sum = BigInteger.valueOf(17);
		
		for (int i = 9; i < max; i += 2) {
			if (isPrime(i)) {
				sum = sum.add(BigInteger.valueOf(i));
				primeList.add(i);
			}
		}
		
		System.out.println(sum);
	}
	
	public static boolean isPrime(int val) {
		boolean prime = true;
		
		for (int i = 0; i < primeList.size(); i++) {
			if (val % primeList.get(i) == 0) {
				prime = false;
				break;
			}
		}
		
		return prime;
	}
}
