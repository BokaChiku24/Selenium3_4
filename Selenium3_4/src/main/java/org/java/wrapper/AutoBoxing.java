package org.java.wrapper;

public class AutoBoxing {

	public static void main(String[] args) {
		int var = 10;
		@SuppressWarnings("removal")
		Integer obj = new Integer(var);
		System.out.println(obj); // 10 -- Wrapping -- Autoboxing
		int i = obj.intValue(); // Unwrapping -- UnBoxing
		System.out.println(i);
	}

}
