package com.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersStartingWithOne4 {
	
	public static void main(String[] args) {
		
		
        List<Integer> numbers = Arrays.asList(11, 18, 20, 24, 85, 66, 13);
        
        
        List<Integer> collect = numbers
        .stream()
        .map(String::valueOf)
        .filter(numberrr->numberrr.startsWith("1"))
        .map(Integer::valueOf)
        .collect(Collectors.toList());
        
        
        
        System.out.println("Numbers starting with 1 :"+ collect);

	}

}
