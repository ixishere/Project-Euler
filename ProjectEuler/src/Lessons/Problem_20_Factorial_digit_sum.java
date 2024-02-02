package Lessons;

import java.math.BigInteger;

public class Problem_20_Factorial_digit_sum {

	/*
	 * n! means n × (n − 1) × ... × 3 × 2 × 1

		For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
		and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

		Find the sum of the digits in the number 100!
	 */
	
	public static void main(String[] args) {
		BigInteger result = factorial("100");
		
		BigInteger sum = BigInteger.ZERO;
		
		for(char i : result.toString().toCharArray()) {
			BigInteger digit = new BigInteger(i + "");
			
			sum = sum.add(digit);
		}
		System.out.println(sum);
	}

	private static BigInteger factorial(String n) {
		BigInteger number = new BigInteger(n);
		
		if (n.toString() == "0") {
			return BigInteger.ONE;
		}
		else {
			return(number.multiply(factorial(number.subtract(BigInteger.ONE).toString())));  
		}
	}
	
}
