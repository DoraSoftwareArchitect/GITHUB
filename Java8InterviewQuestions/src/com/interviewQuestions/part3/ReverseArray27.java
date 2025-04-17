package com.interviewQuestions.part3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray27 {
	
	public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        
        List<Integer> asList = Arrays.asList(arr);
        Collections.reverse(asList);
        System.out.println(asList); // [5, 4, 3, 2, 1]

        
        

	}

}
