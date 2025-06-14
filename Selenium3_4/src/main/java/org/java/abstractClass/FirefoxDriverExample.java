package org.java.abstractClass;

// The type FirefoxDriverExample must implement the inherited abstract method WebDriverExample.sendKeys()

public abstract class FirefoxDriverExample extends WebDriverExample{

	@Override // @Override it helps to identify method is override from the parent class
	
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract void child();

	
}
