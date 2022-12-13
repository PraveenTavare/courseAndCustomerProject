package com.example.course.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamExamples {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,40,70,100,50,30,500,200,1033);

		// MAX number
		System.out.println("MAX number : " +list.stream().max( (a,b) ->a.compareTo(b)).get());
		//MIN Number
		System.out.println("MIN number : " +list.stream().min((a,b) -> a.compareTo(b)).get());
		// 3rd Max Number
		System.out.println("3rd MAX number : " +list.stream().sorted(Collections.reverseOrder()).
				distinct().skip(2).findAny().get());
		// 3rd Min Number
		System.out.println("3rd MIN number : " +list.stream().sorted().distinct().
				skip(2).findFirst().get());
		System.out.println(list.stream().reduce(Integer::sum).get());
		
		int[] A = { 1, 2, 3, 4, 5 };
        int sum = Arrays.stream(A).sum();
 
        System.out.println("The sum of all the array elements is " + sum);
        System.out.println( Arrays.stream(A).reduce((x, y) -> x + y).getAsInt());
        
        System.out.println("Printing 3rd element : " +list.stream().skip(2).findAny().get());
        
        System.out.println("Printing even numbers :" +list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
        
        System.out.println("Printing Odd numbers :" +list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList()));
        
        String str = "dsssdrrveenPP";
        
        System.out.println("Occurances of given character in a String :" +Arrays.stream(str.split("")).map(String::toLowerCase).sorted().
        		collect(Collectors.groupingBy(s->s, LinkedHashMap::new,Collectors.counting())));
        
        char count[] = new char[256];
        int index = -1;
        
        for (int j = 0; j < str.length(); j++)
            count[str.charAt(j)]++;
        
        for (int j = 0; j < str.toLowerCase().length(); j++) {
        	if(count[str.charAt(j)] == 1) {
        		index = j;
        		break;
        	}
        }
        System.out.println(index == -1 ? "String is null" : "First non-repeating character is : " 
        +str.charAt(index));
	}
        	

}

