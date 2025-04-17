package com.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElement10 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		Optional<Integer> first = numbers.stream().findFirst();
		System.out.println("First Element in the list of numbers :" + first);

		first.ifPresent(System.out::println);

	}

}
