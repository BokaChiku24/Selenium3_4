package org.java.polymorphism;

public class OverloadingP2 {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 10;
		OverloadingP2 obj = new OverloadingP2();
		obj.add(10, 10);
		obj.add(b1, b2);
		obj.add(10, 10, 10);
		obj.doLogin(1234567890L, "Kunal");
		obj.doLogin(1234567890L, 1234);
		obj.doLogin("Kunal", 1234);
		// obj.add(1,2); Ambiguity
		obj.add(10, 10, 10, 10, 10, 10);
	}

	public void add(int a, int b) {
		System.out.println((a + b));
	}

	// Passing array to the method parameter
	public void add(int... a) {
		@SuppressWarnings("unused")
		int[] array = a;
	}
	
	public void add(byte a, byte b) {
		System.out.println((a + b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println((a + b + c));
	}
	
	/*
	 * public void add(int a, double b) {
	 * System.out.println((a + b));
	 * }
	 * 
	 * public void add(double a, int b) {
	 * System.out.println((a + b));
	 * }
	 */

	/*
	 * Q1: Can we achieve overloading by keeping the method signature same and
	 * changing the return type 
	 * Ans: NO
	 * 
	 * public void add(int a, int b) { 
	 * System.out.println((a+b)); 
	 * }
	 * 
	 * public int add(int a, int b, int c) { 
	 * return a+b+c; 
	 * }
	 */

	/*
	 * Q2: Can we achieve overloading by in int and long case? 
	 * Ans: Yes
	 * 
	 * public void add(int a, long b) { 
	 * System.out.println((a+b)); 
	 * }
	 * 
	 * public void add(long a, long b) { 
	 * System.out.println((a+b)); 
	 * }
	 * 
	 * public void add(long a, int b) { 
	 * System.out.println((a+b)); 
	 * }
	 * 
	 */
	
	/*
	 * Q3: Can we overload the main() method? 
	 * Ans: Yes (Change the signature of the method)
	 */
	
	/*
	 * System.out.println() - Here println() is the overloaded method in Java
	 */
	
	// Selenium Scenario

	public void doLogin(long mobileNumber, String password) {
		System.out.println("Mobile Number: " + mobileNumber + " " + "Password: " + password);
	}

	public void doLogin(long mobileNumber, int otp) {
		System.out.println("Mobile Number: " + mobileNumber + " " + "OTP: " + otp);
	}

	public void doLogin(String username, int otp) {
		System.out.println("User Name: " + username + " " + "OTP: " + otp);
	}
}
