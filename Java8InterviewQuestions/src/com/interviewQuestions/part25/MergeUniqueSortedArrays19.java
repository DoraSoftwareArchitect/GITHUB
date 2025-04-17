package com.interviewQuestions.part25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeUniqueSortedArrays19 {
	public static void main(String[] args) {
		
		
		Integer[] arr1 = {5, 2, 9, 2};
        Integer[] arr2 = {3, 8, 6, 5};
        
        List<Integer> collect = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).collect(Collectors.toList());
        
        
        System.out.println(collect);
	}

}
