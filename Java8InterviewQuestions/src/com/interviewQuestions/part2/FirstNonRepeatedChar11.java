package com.interviewQuestions.part2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar11 {
	
	public static void main(String[] args) {
		
		
        String str = "Java articles are Awesome";
        
       Character orElse = str.chars().mapToObj(charecter->(char)charecter)
        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()))
        .entrySet()
        .stream()
        .filter(entry->entry.getValue()==1)
        .map(Map.Entry::getKey)
        .findFirst().orElse(null);
        
        System.out.println(orElse);

	}

}
