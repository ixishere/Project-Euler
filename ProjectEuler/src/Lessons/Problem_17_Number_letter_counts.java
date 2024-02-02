package Lessons;

public class Problem_17_Number_letter_counts {

	/*
	 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
	 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

		If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
		how many letters would be used?


		NOTE: Do not count spaces or hyphens. 
		For example, 342 (three hundred and forty-two) contains 23 letters and 115 
		(one hundred and fifteen) contains 20 letters. 
		The use of "and" when writing out numbers is in compliance with British usage.
	 */
	
	public static void main(String[] args) {
		int totalLetters = 0;
		for(int i = 1; i <= 1000; i++) {
			for(char s : convert(i).toCharArray()) {
				totalLetters++;
			}
		}
		System.out.println(totalLetters);
	}
	
	private static final String[] tensNames = {
		"",
		"ten",
		"twenty",
		"thirty",
		"forty",
		"fifty",
		"sixty",
		"seventy",
		"eighty",
		"ninety"
	};

	private static final String[] numNames = {
		"",
		"one",
		"two",
		"three",
		"four",
		"five",
		"six",
		"seven",
		"eight",
		"nine",
		"ten",
		"eleven",
		"twelve",
		"thirteen",
		"fourteen",
		"fifteen",
		"sixteen",
		"seventeen",
		"eighteen",
		"nineteen"
	};

	private static final int[] hundreds = {
		100,
		200,
		300,
		400,
		500,
		600,
		700,
		800,
		900
	};
	
	public static String convert(int number) {
	    String soFar;
	    int originalNum = number;
	    
	    if(originalNum > 1000)
	    	return "error";
	    
	    if(originalNum == 1000)
	    	return "onethousand";
	    
	    if (number % 100 < 20){
	      soFar = numNames[number % 100];
	      number /= 100;
	    }
	    else {
	      soFar = numNames[number % 10];
	      number /= 10;
	 
	      if(originalNum > 100) {
	    	  soFar = tensNames[number % 10] + soFar;
	      }else {
	    	  soFar = tensNames[number % 10] + soFar;
	      }
	      
	      number /= 10;
	    }
	    if (number == 0) return soFar;
	    
	    for(int i : hundreds) {
	    	if(originalNum == i) {
	    		return numNames[number] + "hundred" + soFar; 
	    	}
	    }
	    
	    return numNames[number] + "hundredand" + soFar;
	 }

}
