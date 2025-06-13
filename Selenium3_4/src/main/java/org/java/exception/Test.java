package org.java.exception;

public class Test {

	public static void main(String[] args) {
		System.out.println("Beginning");

		try {

			int output = 10 / 0;

			System.out.println("Output is: " + output);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // / by zero
			e.printStackTrace(); 
			
			/*
			 * java.lang.ArithmeticException: / by zero at
			 * org.java.exception.Test.main(Test.java:10)
			 */
		} catch (Throwable t) {
			t.printStackTrace();
		}

		finally {
			System.out.println("In finally blog");
		}

		System.out.println("End");
	}

}
