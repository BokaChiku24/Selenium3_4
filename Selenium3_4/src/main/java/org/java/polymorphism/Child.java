package org.java.polymorphism;

public class Child extends Parent{

	public void show() {
		System.out.println("Show me what you got !!");
	}
	
	public void display() {
		System.out.println("Show me what you display !!");
	}
	
	public static void multi() {
		System.out.println("Show me what you display !!");
	}
	
	public static void main(String[] args) {

		Parent obj = new Child(); // All matching method in parent and child class can be call by obj polymorphic reference
		obj.show();
		// obj.display(); // The method display() is undefined for the type Parent
		obj.add(); // Can be access because this method declared in parent class
		obj.multi(); // For Parent obj = new Child() it will call parent class method
		
		Child obj2 = new Child(); 
		obj2.multi(); // For Child obj2 = new Child() it will call child class method
		
	}

}
