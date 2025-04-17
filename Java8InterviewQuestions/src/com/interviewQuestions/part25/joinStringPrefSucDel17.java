package com.interviewQuestions.part25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joinStringPrefSucDel17 {
	
	public static void main(String[] args) {
		
        List<String> words = Arrays.asList("Java", "Python", "C++");
        
        String collect = words.stream().collect(Collectors.joining(",", "[", "]"));
        
        System.out.println("String used delimiter Prefix and Suffix :"+collect);

	}

}
