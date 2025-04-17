package com.interviewQuestions.part3;

public class SumOfDigitsInNumber21 {
	
	
	public static void main(String[] args) {
		
	    int num = 15623;
	    int sum = String.valueOf(num)
	    .chars()
	    .map(Character::getNumericValue)
	    .sum();

	    
	    System.out.println("Total sum of the value :"+num); // 15623
	    
	    

	}


}
