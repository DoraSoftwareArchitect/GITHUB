package com.interviewQuestions.part25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSortDecimals16 {
	
	public static void main(String[] args) {
		
		
        List<Double> decimals = Arrays.asList(4.5, 2.3, 9.8, 7.1);
        
        
        List<Double> collect = decimals.stream().sorted((a,b)->Double.compare(b, a))
        .collect(Collectors.toList());
        
        System.out.println("Reversing the AWS :"+collect);
        

	}

}
