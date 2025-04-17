package com.interviewQuestions.part3;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement29 {
	
	public static void main(String[] args) {
		
		
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4};
        
        Integer key = Arrays.stream(arr)
        .boxed()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue())
        .get()
        .getKey();
        
        
        System.out.println("Value :"+key);

	}

}
