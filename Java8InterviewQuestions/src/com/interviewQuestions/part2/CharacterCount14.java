package com.interviewQuestions.part2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount14 {
	
	public static void main(String[] args) {
		
		String name="Dora Sri Vignesh";
		Map<Character, Long> collect = name.chars().mapToObj(charecter->(char)charecter)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		System.out.println("Charecter count in the string :"+ collect);
		
		
	}

}
