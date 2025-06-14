package org.java.polymorphism;

public class OverridingNotUsingDrawBacksP1 extends OverridingNotUsingDrawBacks {
	
	public static void main(String[] args) {
		OverridingNotUsingDrawBacks obj = new OverridingNotUsingDrawBacks();
		obj.click();
		obj.sendKeys();
		obj.getTitle();
	}

}
