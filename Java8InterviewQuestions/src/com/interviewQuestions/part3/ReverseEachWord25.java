package com.interviewQuestions.part3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord25 {
	 public static void main(String[] args) {
		
		 
	        String str = "Hello World Java";
	        
	        String collect = Arrays.stream(str.split(" /n"))
	        .map(data->new StringBuilder(data).reverse().toString())
	        .collect(Collectors.joining());
	        
	        System.out.println("Revereseing each word in the string :"+ collect);

	}

}
