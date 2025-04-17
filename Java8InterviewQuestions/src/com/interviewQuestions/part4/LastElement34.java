package com.interviewQuestions.part4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LastElement34 {
	
	public static void main(String[] args) {
		
        List<String> words = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        Optional<String> reduce = words.stream().reduce((first,second)->second);
        System.out.println("Last Element in string :"+reduce);
	}

}
