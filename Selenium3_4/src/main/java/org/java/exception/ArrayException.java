package org.java.exception;

public class ArrayException {

	public static void main(String[] args) {

		int[] array = new int[5];
		array[6] = 100;
		System.out.println(array[6]);
		
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6
		 * out of bounds for length 5 at
		 * org.java.exception.ArrayException.main(ArrayException.java:8)
		 */
		
	}

}
