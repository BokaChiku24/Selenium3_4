package org.java.methods;

public class MethodCalling {

	/*
	 * 1) Static components --> It can not call non-static component directly
	 * 2) Non-Static component --> It can call static component directly
	 * 3) Static components --> it can call all static components directly
	 * 4) Non-Static component --> It can call non-static component directly
	 * 5) If we call everything in static then we are not following Object orientation programming concepts
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCalling obj = new MethodCalling();
		obj.go();
		MethodCalling.go2();
		obj.go4();
	}
	
	public void go() {
		System.out.println("Inside Go Method !!");
		go1(); // Non-static method can be called in non-static method
	}
	
	public void go1() {
		System.out.println("Inside Go 1 Method !!");
	}

	public static void go2() {
		System.out.println("Inside Go 2 Method !!");
		go3(); // Static method can be called in static method
	}
	
	public static void go3() {
		System.out.println("Inside Go 3 Method !!");
	}
	
	public void go4() {
		System.out.println("Inside Go 4 Method !!");
		go5(); // Static method can be called in non-sttaic method
	}
	
	public static void go5() {
		System.out.println("Inside Go 5 Method !!");
		
	}
}
