package Lessons;

public class Problem_04_Largest_palindrome_product {

	/*
	 * A palindromic number reads the same both ways. 
	 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

		Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	
	public static void main(String[] args) {
		int min = 100;
		int max = 999;
		
		int biggest = 0;
		
		for(int i = min; i <= max; i++) {
			for(int ii = min; ii <= max; ii++) {
				int num = i * ii;
				String s = String.valueOf(num);
				
				String left = s.substring(0, (s.length()/2));
				String right = s.substring((s.length()/2));
				
				StringBuilder sb = new StringBuilder();
				sb.append(right);
				
				if(left.equals(sb.reverse().toString())) {
					if(biggest < Integer.parseInt(s))
					biggest = Integer.parseInt(s);
				}
			}
		}
		System.out.println(biggest);
	}
}
