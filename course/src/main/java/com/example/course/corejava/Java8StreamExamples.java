package com.example.course.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamExamples {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,40,70,100,50,30,500,200);

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
	}

}
