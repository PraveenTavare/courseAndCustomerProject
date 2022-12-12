package com.example.course.corejava;

import java.util.Arrays;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {

		System.out.println("To remove duplicates from an array --- using HashSet :: ");

		int arr[] = { 60, 40, 20, 10, 20, 30, 40, 50, 10, 10, 10 };
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);

		System.out.println("------------------------------");
		System.out.println("To remove duplicates from an array --- ");

		int size = arr.length;
		Arrays.sort(arr);

		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[size - 1];

		// printing array elements
		for (int i = 0; i < j; i++)
			System.out.print(arr[i] + " ");

	}

}
