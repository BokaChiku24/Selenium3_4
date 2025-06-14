package org.java.interfaceExcample;

public interface WebDriverExample {
	
	public static final int NUMBER_IS = 0;

	public void click(); // Compiler: public abstract void click();
	public abstract void sendKeys(); 
	
	default void defaultmethod() {
		System.out.println("Default method allow in Interface");
	}
	
	static void staticMethod() {
		System.out.println("Static method..");
	}


}
