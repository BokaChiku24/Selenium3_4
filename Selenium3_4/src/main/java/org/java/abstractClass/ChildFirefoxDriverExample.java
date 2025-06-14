package org.java.abstractClass;

// The type ChildFirefoxDriverExample must implement the inherited abstract method FirefoxDriverExample.child()

public class ChildFirefoxDriverExample extends FirefoxDriverExample {

	@Override
	public void child() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		FirefoxDriverExample obj = new ChildFirefoxDriverExample();
		obj.click();
		// Or
		ChildFirefoxDriverExample obj2 = new ChildFirefoxDriverExample();
		obj2.click();
	}

}
