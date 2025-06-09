package org.java.string;

public class StringConcatenation {

	public static void main(String[] args) {
		String obj = new String("First");
		String str = "Second";
		String newStr = obj + " " + str;
		System.out.println(newStr);
		
		// String + String --> Concatenated String
		System.out.println("Kunal " + "Sanjay " + "Chavan !!");
		
		// int + int --> int
		int numberOne = 10;
		int numberTwo = 5;
		System.out.println("Before: " + numberOne + numberTwo + " After");
		System.out.println("Before: " + (numberOne + numberTwo) + " After");
		System.out.println(numberOne + numberTwo + " After");
		System.out.println("Before: " + numberOne + numberTwo);
	}

}
