package Lessons;

public class Problem_09_Special_Pythagorean_triplet {

	/*
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

		a2 + b2 = c2
		For example, 32 + 42 = 9 + 16 = 25 = 52.

		There exists exactly one Pythagorean triplet for which a + b + c = 1000.
		Find the product abc.
	 */
	
	public static void main(String[] args) {
		
		//int a, b, c = 0;
		
		int upto = 1000;
		
		for(int a = 1; a <= upto; a++) {
			for(int b = 1; b <= upto; b++) {
				for(int c = 1; c <= upto; c++) {
					if(a*a + b*b == c*c) {
						if(a + b + c == 1000) {
							System.out.println(a*b*c);
						}
					}
				}
			}
		}
		
	}
	
}
