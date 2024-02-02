package Lessons;

import java.util.ArrayList;
import java.util.List;

public class Problem_14_Longest_Collatz_sequence {

	/*
	 * The following iterative sequence is defined for the set of positive integers:

	n → n/2 (n is even)
	n → 3n + 1 (n is odd)

	Using the rule above and starting with 13, we generate the following sequence:

	13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
	Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

	Which starting number, under one million, produces the longest chain?

	NOTE: Once the chain starts the terms are allowed to go above one million.
	 */
	
	public static void main(String[] args) {
		
		int largestChain = 0;
		long value = 0L;
		
		for(long i = 1L; i <= 1000000; i++) {
			int result = CollatzSequenceArray(i);
			if(largestChain < result) {
				largestChain = result;
				value = i;
			}
			System.out.println(value + ": " + largestChain);
		}

	}

	private static int CollatzSequenceChain(long n) {
		int amountInChain = 1;
		long CollatzNum = n;
		
		while(CollatzNum != 1) {
			if(CollatzNum % 2 == 0) 
				CollatzNum = CollatzNum / 2;
			else 
				CollatzNum = 3 * CollatzNum + 1;
			amountInChain++;
		}
		return amountInChain;
	}
	
	private static int CollatzSequenceArray(long n) {
		List<Long> chain = new ArrayList<Long>();
		
		long CollatzNumber = n;
		
		chain.add(CollatzNumber);
		
		while(CollatzNumber != 1) {
			if(CollatzNumber % 2 == 0) {
				CollatzNumber = CollatzNumber /2;
				chain.add(CollatzNumber);
			}
			else {
				CollatzNumber = 3 * CollatzNumber + 1;
				chain.add(CollatzNumber);
			}
		}
		return chain.size();
	}
}
