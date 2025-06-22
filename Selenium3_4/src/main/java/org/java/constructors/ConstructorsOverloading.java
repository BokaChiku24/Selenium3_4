package org.java.constructors;

public class ConstructorsOverloading {

	public ConstructorsOverloading() {
		System.out.println("This is default constructor");
	}

	public ConstructorsOverloading(String Name) {
		this();
		System.out.println("One Paramater: " + Name);
	}

	public ConstructorsOverloading(String Name, String password) {
		System.out.println("One Paramater: " + Name + " " + "Second Paramater: " + password);
	}

	public ConstructorsOverloading(String Name, long phoneNumber) {
		this("Kunal", "Password");
		System.out.println("One Paramater: " + Name + " " + "Second Phone Number: " + phoneNumber);
	}
	
	public void show() {
		System.out.println("Show method");
	}
	
	public void display() {
		this.show();
	}
	
	public static void main(String[] args) {
		ConstructorsOverloading obj = new ConstructorsOverloading("Kunal");
		ConstructorsOverloading obj2 = new ConstructorsOverloading("Kunal",1234567890L);
		// this.show();Cannot use this in a static context
		obj.display();
		obj2.display();
	}

}
