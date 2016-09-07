/**
 * 
 * @author JGreeny
 *
 * @problem Project Euler Problem 9:
 * 			A Pythagorean triplet is a set of three natural numbers,
 * 			a < b < c, for which, a^2 + b^2 = c^2
 * 
 * 			For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 			There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * 			Find the product abc.
 * 			
 * @solution Given: a < b < c and a + b + c = 1000
 * 			 We can deduce the max possible values are: a= 332, b= 499, c= 997
 * 
 * 			 Brute force:
 * 				Test all possible combinations of a, b, c.
 * 				For each a, b, c
 * 					check if a^2 + b^2 = c^2
 * 					if yes, found right combination
 * 					else, keep going
 * 
 * 			Once correct combination is found, find the product of the triplet and print it.
 */

public class Problem009 {
	public static void main(String[] args) {
		int a = 0,
			aMax = 332,
			b = 0,
			bMax = 499,
			c = 0,
			sum = 1000;
		
		boolean found = false;
		
		while ((a < aMax) && !found) {
			a++;
			b = a;
			c = sum - a - b;
			while ((b < bMax) && !found) {
				b++;
				c--;
				if ((a*a + b*b) == (c*c)) {
					found = true;
				}
			}
		}
		
		System.out.printf("a = %d, b = %d, c = %d, product = %d", a, b, c, a*b*c);
	}
}
