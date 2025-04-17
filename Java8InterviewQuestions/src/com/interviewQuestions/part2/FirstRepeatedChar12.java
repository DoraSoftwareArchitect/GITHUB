package com.interviewQuestions.part2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstRepeatedChar12 {

	public static void main(String[] args) {

		String str = "Java articles are Awesome";

		Set<Character> seen = new HashSet<>();

		Character orElse = str.chars()
				
				.mapToObj(charecter -> (char) charecter)
				.filter(charecter -> !seen.add(charecter))
				.findFirst().orElse(null);

		System.out.println(orElse);

	}

}
