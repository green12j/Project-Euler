import java.math.BigInteger;

/**
 * 
 * @author JGreeny
 *
 * @problem Project Euler Problem 16:
 * 			215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 			What is the sum of the digits of the number 21000?
 * 			
 * @solution Using BigInteger, multiply 2 by itself 999 times. (Gives us 2^1000)
 * 			 Convert the BigInteger into a String and add each value to a new
 * 			 variable. Print out the value.
 */

public class Problem016 {
	public static void main(String[] args) {
		int power = 1000,
			sum = 0;
		
		String preSum = "";
		BigInteger num = BigInteger.valueOf(2);
		
		while (power > 1) {
			num = num.multiply(BigInteger.valueOf(2));
			power--;
		}
		
		preSum = num.toString();
		
		for (int i = 0; i < preSum.length(); i++) {
			sum += Character.getNumericValue(preSum.charAt(i));
		}
		
		System.out.println(sum);
	}
}
