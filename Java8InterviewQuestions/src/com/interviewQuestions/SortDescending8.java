package com.interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortDescending8 {
	
	public static void main(String[] args) {
		
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 6);
        
        
        Set<Integer> collect = numbers.stream().sorted()
        		.collect(Collectors.toSet());
        
        
        //Here as we can observe the set can not be reveresed back to the asecnding order\.
        
        System.out.println(collect);
        
        System.out.println("-------  Ascending Order -------------");
        
        List<Integer> collect1 = numbers.stream().sorted(Comparator.reverseOrder())
        		.collect(Collectors.toList());
        
        // only the list can be able to ascend the order.
        
        System.out.println(collect1);
        
        

	}

}
