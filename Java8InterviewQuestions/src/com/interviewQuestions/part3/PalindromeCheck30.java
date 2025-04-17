package com.interviewQuestions.part3;

import java.util.stream.IntStream;

public class PalindromeCheck30 {
	
	public static void main(String[] args) {
		
        String str = "madam";

        
       boolean isPalindrome=  IntStream.range(0, str.length()/2)
        .allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
       
       System.out.println("Given String is palindrome or not :"+ isPalindrome);
       
       boolean isPalindrome1 = IntStream.range(0, str.length() / 2)
               .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));

       System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
        
	}

}
