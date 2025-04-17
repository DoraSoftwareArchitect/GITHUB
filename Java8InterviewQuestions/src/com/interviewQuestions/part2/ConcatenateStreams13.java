package com.interviewQuestions.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStreams13 {
	
	
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java", "Python");
        List<String> list2 = Arrays.asList("C++", "Go");
        
        List<String> collect = Stream.concat(list1.stream(), list2.stream())
        .collect(Collectors.toList());
        
        System.out.println(collect); //[Java, Python, C++, Go]


	}

}
