package com.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumEvenOdd5 {
	
	
	public static void main(String[] args) {
		
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        
        List<Integer> evenNumber = numbers.stream().filter(data->data%2==0).collect(Collectors.toList());
        
        List<Integer> oddNumber = numbers.stream().filter(data->data%2!=0).collect(Collectors.toList());
        
        System.out.println("Even Numbers :"+evenNumber);
        
        System.out.println("Odd Numbers :"+oddNumber);
        
        


	}

}
