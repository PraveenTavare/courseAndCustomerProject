package com.example.course.corejava;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("abc", "", "def", "", "ghi", "xyz1", "");
		Long emptyStrCnt = strList.stream().filter(str -> str.isEmpty()).count();
		System.out.println(emptyStrCnt);

		System.out.println(strList.stream().filter(str -> str.length() >= 3).count());

		System.out.println(strList.stream().filter(str -> str.startsWith("a")).count());

		System.out.println();

		String strArr[] = { "Ramesh", "Shankar", "Sunil", "Anil", "Vinod", "Vijay", "", "" };

		Arrays.asList(strArr).stream().filter(str -> str.startsWith("S")).forEach(n -> System.out.println(n));

		System.out.println(Arrays.asList(strArr).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()));

		System.out.println(Stream.of(strArr).filter(str -> str.length() > 4).collect(Collectors.toList()));

		System.out.println(Stream.of(strArr).map(s -> s.toUpperCase()).collect(Collectors.joining(",")));

		System.out.println();

//		String s = "gwfdefobdsfd";
//
//		System.out.println(Arrays.stream(s.split("")).map(String::toLowerCase)
//				.collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting())));

		List<Integer> intList = Arrays.asList(1, 2, 4, 5, 10, 10);
		System.out.println(intList.stream().map(i -> i * i).distinct().collect(Collectors.toList()));

		System.out.println(intList.stream().min((a, b) -> a.compareTo(b)).get());
		System.out.println();

		List<Integer> primesList = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

		System.out.println(primesList.stream().mapToInt(i -> i).summaryStatistics().getMin());

		System.out.println(primesList.stream().mapToInt(i -> i).summaryStatistics().getSum());

		System.out.println(primesList.stream().map(i -> i).reduce(0, Integer::sum));

		System.out.println(primesList.stream().mapToInt(i -> i).summaryStatistics().getAverage());

		// sum of all the odd numbers

		System.out.println(primesList.stream().filter(i -> i % 2 == 1).reduce(0, Integer::sum));

		// sum of squares of all the odd numbers

		System.out.println(primesList.stream().filter(i -> i % 2 == 1).map(i -> i * i).reduce(0, Integer::sum));

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		
		System.out.println(items.stream().collect(Collectors.groupingBy(Function.identity() ,Collectors.counting())));

	}

}
