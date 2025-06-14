package org.java.polymorphism;

public class OverridingNotUsingDrawBacksP2 extends OverridingNotUsingDrawBacks {

	
	// Now for OverridingNotUsingDrawBacksP2 there is chance that OverridingNotUsingDrawBacks method not works
	// Here we need Method Overriding to overcome this draw back
	public static void main(String[] args) {
		OverridingNotUsingDrawBacksP2 obj = new OverridingNotUsingDrawBacksP2();
		obj.click();
		obj.sendKeys();
		obj.getTitle();
	}

}
