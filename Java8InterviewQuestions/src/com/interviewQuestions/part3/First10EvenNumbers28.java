package com.interviewQuestions.part3;

import java.util.stream.IntStream;

public class First10EvenNumbers28 {
	
	public static void main(String[] args) {
		
		
		System.out.println("------ Even Numbers----");
		IntStream.iterate(2, n->n+2).limit(5).forEach(a->System.out.print(a));
		
		System.out.println();
		
		System.out.println();


		System.out.println("-----Odd Numbers-------");
		
		IntStream.iterate(1, n->n+2).limit(5).forEach(data->System.out.print(data));
	}

}
