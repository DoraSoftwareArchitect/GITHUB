package com.interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	
	
	public static void main(String[] args) {
		
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 3, 5);
        
        list.stream().distinct().forEach(numbers->System.out.print(numbers));

	}

}
