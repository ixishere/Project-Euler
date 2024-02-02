package Lessons;

public class Problem_06_Sum_square_difference {

	/*
	 * https://prnt.sc/u1wqnq
	 */
	
	public static void main(String[] args) {
		
		int numberTo = 100;
		int sumOfSquares = 0;
		int squareOfSum = 0;
		
		int basenumber = 0;
		for(int i = 0; i <= numberTo; i++) {
			basenumber += i;
			
			sumOfSquares += i * i;
		}
		squareOfSum = basenumber * basenumber;
		
		int difference = squareOfSum - sumOfSquares;
		
		System.out.println(difference);
	}

}
