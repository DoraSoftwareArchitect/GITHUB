package com.interviewQuestions;

public class SumOfDigits9 {
	
	
	public static void main(String[] args) {
		
        String str = "ab11212121212122pq34";

        
        int sum = str.chars()
        .filter(Character::isDigit)
        .map(Character::getNumericValue)
        .distinct()
        .sum();
        
        
        System.out.println("Sum of the digits in the string :"+sum);
        
	}

}
