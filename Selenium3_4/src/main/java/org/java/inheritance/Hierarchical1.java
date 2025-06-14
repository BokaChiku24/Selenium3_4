package org.java.inheritance;

public class Hierarchical1 extends Hierarchical {
	
	public void eat() {
		System.out.println("Eating..");
	}
	
	public static void main(String[] args) {
		Hierarchical1 obj = new Hierarchical1();
		obj.sound();
		obj.eat();
	}

}
