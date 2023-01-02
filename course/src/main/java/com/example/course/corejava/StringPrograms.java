package com.example.course.corejava;

public class StringPrograms {

	public static void main(String[] args) {

		String s1 = "javaaa"; // length = 4
		getOccurringChar(s1);
	}

	static void getOccurringChar(String str) {

		// Create an array of size 256
		// i.e. ASCII_SIZE
		int count[] = new int[256];

		// Create a char array of given String size
		char ch[] = new char[str.length()];

		// Initialize count array index
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++; // count[a]++, 
		
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				// If any matches found
				if (str.charAt(i) == ch[j])
					find++;
			}

			if (find == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
		}
	}

}
