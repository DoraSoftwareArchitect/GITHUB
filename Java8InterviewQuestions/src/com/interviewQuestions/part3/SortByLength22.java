package com.interviewQuestions.part3;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortByLength22 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

		Set<String> collect = words.stream().sorted((a, b) -> Integer.compare(a.length(), b.length()))
				.collect(Collectors.toSet());

		System.out.println(collect);

		// [C#, Java, C++, C, COBOL, HTML, Python, Kotlin]

		// Here we have only Integer.compare ,
		// By the help of this method we are able to acessing the method
		// This is all about the data that we can have.

	}

}
