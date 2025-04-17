package com.interviewQuestions.part3;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class SumAndAverage23 {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        
        IntSummaryStatistics sum=  Arrays.stream(arr).summaryStatistics();	
        
        System.out.println(sum.getSum());
        
        
        System.out.println("Average :"+sum.getAverage());
        
        System.out.println("Maximum : "+sum.getMax());
        
        System.out.println("Minimum :"+sum.getMin());
        
        
        System.out.println("Counting of numbers :"+sum.getCount());
        }

}
