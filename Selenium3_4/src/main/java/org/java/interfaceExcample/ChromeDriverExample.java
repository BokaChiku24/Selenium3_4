package org.java.interfaceExcample;

public class ChromeDriverExample implements WebDriverExample {
	
	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		WebDriverExample obj = new ChromeDriverExample();
		obj.defaultmethod();
		WebDriverExample.staticMethod();
	}

}
