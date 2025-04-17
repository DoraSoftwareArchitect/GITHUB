package com.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsStartingWithVowels7 {
	
	
	public static void main(String[] args) {
		
		
        List<String> words = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Egg", "Umbrella");

        
        List<String> collect = words.stream().filter(wordd->wordd.matches("(?i)^[AEIOU].*"))
        .collect(Collectors.toList());
        
        System.out.println("Collectors "+collect);
        
	}
	

}
