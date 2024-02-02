package Lessons;

public class Problem_03_Largest_prime_factor {

	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29.
		What is the largest prime factor of the number 600851475143 ?
	 */
	
	public static void main(String[] args) {

		double number = 600851475143L;
	
		for(int i = 0; i <= number; i++) {
			if(i != 0)
			if(number % i == 0) {
				if(isPrime(i)) {
					System.out.println(i + " is a prime number");
				}else {
					System.out.println(i);
				}
			}
		}
		
	}
	
	static boolean isPrime(int n) 
    { 
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
        return true; 
    } 
}
