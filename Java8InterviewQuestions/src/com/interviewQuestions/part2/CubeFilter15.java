package com.interviewQuestions.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeFilter15 {
	
	public static void main(String[] args) {
		
        List<Integer> numbers = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
        
        List<Integer> collect = numbers.stream().map(s->s* s * s)
        .filter(n->n>50)
        .collect(Collectors.toList());
        
        System.out.println(collect);
        
        System.out.println("----Collect even numbners and make them sqaure -------");
        
        
        List<Integer> collect2 = numbers.stream().filter(a->a%2==0).map(n->n*n).collect(Collectors.toList());

        System.out.println(collect2);
		
	}

}
