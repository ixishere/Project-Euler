package Lessons;

import java.math.BigInteger;

public class Problem_16_Power_digit_sum {

	/*
	 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

		What is the sum of the digits of the number 2^1000?
	 */
	
	public static void main(String[] args) {
		
		int n = 2;
		int power = 1000;
		
		int sum = 0;
		
		BigInteger number = new BigInteger(String.valueOf(n));
		String poweredNumString = number.pow(power).toString();
		
		/* Does not work. Do not understand why yet.
		for(int i = 0; i < poweredNumString.length(); i++) {
			sum += poweredNumString.charAt(i);
		}
		*/
		
		for(char s : poweredNumString.toCharArray()) {
			sum += Integer.parseInt(s + "");
		}
		
		System.out.println(sum);
	}

}
