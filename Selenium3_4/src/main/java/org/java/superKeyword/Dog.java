package org.java.superKeyword;

public class Dog extends Animal {

	public Dog() {
		System.out.println("Dog Constructor !!");
	}
	
	public void sound() {
		System.out.println("Bowww..");
		System.out.println("Calling parent sound method by suing 'super' keyword.");
		super.sound();
	}
	
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.sound();
		/*
		 * System.out.println("Calling parent sound method by suing 'super' keyword.");
		 * super.sound(); // Cannot use super in a static context
		 */	
		
		/*
		 * JVM/Compiler by default add super() insider the constructor calling. 
		 * super() calls the parent constructor. It performs the chaining action. 
		 * 
		 * i.e. 
		 * public Dog() {
		 * super(); --> Calls Animal constructor
		 * System.out.println("Dog Constructor !!");
		 * }
		 * 
		 */
	}

}
