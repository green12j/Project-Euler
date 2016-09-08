/**
 * 
 * @author JGreeny
 *
 * @problem Project Euler Problem 14:
 * 			The following iterative sequence is defined for the set of positive integers:
 *
 *			n -> n/2 (n is even)
 *			n -> 3n + 1 (n is odd)
 *
 *			Using the rule above and starting with 13, we generate the following sequence:
 *
 *			13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 *			It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 *			Which starting number, under one million, produces the longest chain?
 *
 *			NOTE: Once the chain starts the terms are allowed to go above one million.
 * 			
 * @solution Brute force, check each term in the range [2 , 1000000).
 * 			 Apply the formula to each starting term and count the amount of terms it goes through.
 */

public class Problem014 {
	public static void main(String[] args) {
		int count = 1,
			maxCount = 1,
			maxTerm = 1;
		
		long term = 0L;
		
		for (int i = 2; i < 1000000; i++) {
			count = 1;
			term = i;
			
			while (term > 1) {
				count++;
				
				if (term % 2 == 0)
					term /= 2;
				else
					term = (term * 3) + 1;
			}
			if (count > maxCount) {
				maxCount = count;
				maxTerm = i;
			}
		}
		
		System.out.println(maxTerm);
	}
}
