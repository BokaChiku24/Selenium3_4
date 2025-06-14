package org.java.superKeyword;

public class BullDog extends Dog {
	
	public BullDog() {
		System.out.println("Bull Dog...");
	}
	
	public static void main(String[] args) {
		BullDog b = new BullDog();
		/*
		 * JVM/Compiler by default add super() insider the constructor calling. 
		 * super() calls the parent constructor. It performs the chaining action. 
		 * 
		 * i.e. 
		 * public BullDog() {
		 * super(); ---> Calls Dog constructor
		 * System.out.println("Bull Dog...");
		 * }
		 * 
		 */
		System.out.println(b); // Prints the address of the reference variable
	}

}
