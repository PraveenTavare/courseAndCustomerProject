package com.example.course.corejava;

import java.util.Optional;

public class Java8OptionalClassExample {

	public static void main(String[] args) {

		// Optional class examples
		String s = null;
		
		Optional<String> valPresent = Optional.ofNullable(s);

		if (valPresent.isPresent()) {
			System.out.println(s);
		} else
			System.out.println("String is null");
	}
	

}
