package Lessons;

public class Problem_10_Summation_of_primes {

	/*
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

		Find the sum of all the primes below two million.
	 */
	
	public static void main(String[] args) {
		Long total = 0L;
		
		for(Long i = 0L; i <= 10; i++) {
			if(isPrime(i)) total+= i;
			System.out.println(total + " (" + i + ")");
		}

	}

	static boolean isPrime(Long n) 
    { 
		if (n <= 1) 
            return false;
		if(n % 2 == 0 && n != 2) {
			return false;
		}
		for (Long i = 2L; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
        return true; 
    } 
}
