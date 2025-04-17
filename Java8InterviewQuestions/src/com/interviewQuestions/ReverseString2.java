package com.interviewQuestions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString2 {
	
	
	public static void main(String[] args) {
		
		
        String str = "Java";
        
        String collect = IntStream.range(0, str.length())
        		
        		
        .mapToObj(i->str.charAt(str.length()-i-1))
        .map(String:: valueOf)
        .collect(Collectors.joining());
        
        System.out.println("Reverse Of a String :"+collect);

	}

}
