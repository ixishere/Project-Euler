package Lessons;

public class Problem_05_Smallest_multiple {

	/*
	 * 2520 is the smallest number that 
	 * can be divided by each of the numbers from 1 to 10 without any remainder.

		What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */
	
	public static void main(String[] args) {
		
		int number = 1;
		
		for(;;) {
			
			if(isDivisibleBy1To20(number)) {
				System.out.println(number);
				return;
			}else
			number++;
		}
		
	}

	public static boolean isDivisibleBy1To20(int number) {
		for(int i = 1; i <= 20; i++) {
			if(number % i != 0) {
				return false;
			}	
		}
		return true;
	}
}
