package com.interviewQuestions.part25;

import java.util.Arrays;

public class AnagramCheck20 {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";

		boolean equals = Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());

		System.out.println("Anagram check :" + equals);
		
		// Here both the strings are anagram....
		
		
		

	}

}
