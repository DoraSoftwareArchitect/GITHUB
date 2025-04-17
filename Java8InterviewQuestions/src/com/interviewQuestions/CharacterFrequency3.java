package com.interviewQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency3 {
	
	
	public static void main(String[] args) {
		
		
		String name="Dora Sri Vignesh";
		
		Map<Character, Long> collect = name.chars().mapToObj(ch->(char)ch)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("Charecters Count :"+collect);
	}

}
