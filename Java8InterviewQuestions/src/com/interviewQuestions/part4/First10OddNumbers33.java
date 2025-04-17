package com.interviewQuestions.part4;

import java.util.stream.IntStream;

public class First10OddNumbers33 {

	public static void main(String[] args) {
		
		IntStream.iterate(1, i->i+2)
		.limit(5)
		.forEach(a->System.out.println(a));
	}
}
