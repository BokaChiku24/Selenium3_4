package org.java.constructors;

public class Constructors {

	// Default Constructors
	/*
	 * 1. Constructor name and class name should be same
	 * 2. Constructor don't have return type. 
	 * 3. No need to create default Constructor as JVM by default add this for us behind. 
	 * 4. Constructors is used to initialize the instance variable at the time of object creation
	 * 5. Constructors supports access modifiers. e.g. public, private, default
	 * 6. Private constructors object can not be create from other class if use inheritance
	 * 7. Types of constructors:
	 *    A) default constructor
	 *    B) no-argument constructor
	 *    C) Parameterized constructor
	 */
	public Constructors() {
		System.out.println("Intentinally call constructors");
	}

	public static void main(String[] args) {
		Constructors obj = new Constructors(); // This line will call the constructor
	}

}
