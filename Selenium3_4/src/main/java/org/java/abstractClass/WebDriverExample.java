package org.java.abstractClass;

public abstract class WebDriverExample {

	public abstract void click(); // The abstract method click in type WebDriverExample can only be defined by an abstract class

	public abstract void sendKeys();

	public abstract void getTitle();
	
	public void getScreenshot() {
		System.out.println("Get Screenshot As..");
	}

}
