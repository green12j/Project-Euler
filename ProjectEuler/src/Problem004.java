/**
 * 
 * @author JGreeny
 *
 * @problem Project Euler Problem 4:
 * 			A palindromic number reads the same both ways.
 * 			The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 			Find the largest palindrome made from the product of two 3-digit numbers.
 *			
 * @solution Starting from 999 x 999, going down to 100 x 100 (only potentially), 
 * 			 test each number to see if it is a palindrome. Keep track of the highest palindrome,
 * 			 the last value of the tracker variable will be the highest palindrome.
 * 
 * 			 To test if a number is a palindrome, decide how many digits is has.
 * 			 Since the range is set, the value will be [10000, 998001] - either 5 or 6 digits.
 * 			 Compare the digits using % and / to determine whether they are the same.
 */

public class Problem004 {
	
	public static void main(String[] args) {
		int largest = 1, num1, num2, product;
		
		for(num1 = 999; num1 >= 100; num1--) {
			for(num2 = 999;num2 >= 100; num2--) {
				product = num1 * num2;
				
				if (isPalindrome(product) && product > largest) {
					largest = product;
				}
			}
		}
		
		System.out.println(largest);
	}
	
	public static boolean isPalindrome(int product) {
		int digits[] = new int[6];
		digits[0] = product % 10;
		digits[1] = (product / 10) % 10;
		digits[2] = (product / 100) % 10;
		digits[3] = (product / 1000) % 10;
		digits[4] = (product / 10000) % 10;
		digits[5] = product / 100000;
		
		if (digits[5] == 0) {
			return (digits[4] == digits[0]) && (digits[3] == digits[1]);
		}
		else {
			return (digits[5] == digits[0]) && (digits[4] == digits[1]) && (digits[3] == digits[2]);
		}
	}
}
