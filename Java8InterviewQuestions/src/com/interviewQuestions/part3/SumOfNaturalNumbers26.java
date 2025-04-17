package com.interviewQuestions.part3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfNaturalNumbers26 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter the number to print the sum of natural numbers upto the given range :");
		int n=scanner.nextInt();
		int sum = IntStream.range(0, n).sum();
		System.out.println("Sum of ntural number upto given limit :"+sum);
		
	}

}
