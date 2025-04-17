package com.interviewQuestions.part25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeAndSortArrays18 {

	
	public static void main(String[] args) {
		 int[] arr1 = {5, 2, 9};
	        int[] arr2 = {3, 8, 6};
	        
	        List<Integer> collect = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed())
	        .collect(Collectors.toList());
	        
	        System.out.println(collect); // [5, 2, 9, 3, 8, 6]

	        
	        
	        /// Here we have merged two arr data by the help of the Stream . concat
	        // This is all about the data that we have.
	        
	        
	        
	}
}
