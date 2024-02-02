package Lessons;

public class Problem_07_10001st_prime {

	/*
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

		What is the 10 001st prime number?
	 */
	
	public static void main(String[] args) {
		
		int number = 0;
		int amtOfPrimes = 0;
		
		for(;;) {
			if(isPrime(number)) {
				amtOfPrimes++;
			}
			
			if(amtOfPrimes == 10001) {
				System.out.println(number);
				return;
			}
			
			number++;
		}
	}

	static boolean isPrime(int n) 
    { 
		if (n <= 1) 
            return false;
            		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
        return true; 
    } 
}
