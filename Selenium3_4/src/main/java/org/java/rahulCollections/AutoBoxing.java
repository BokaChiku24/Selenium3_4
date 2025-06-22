package org.java.rahulCollections;

public class AutoBoxing {

	public static void main(String[] args) {

		int var = 10;
		@SuppressWarnings("removal")
		Integer obj = new Integer(var); // wrapping ---> Autoboxing

		System.out.println(obj);

		int i = obj; // unwrapping ---> UnBoxing
		System.out.println(i);

	}

}
