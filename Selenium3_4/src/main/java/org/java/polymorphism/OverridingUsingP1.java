package org.java.polymorphism;

import org.openqa.selenium.WebDriver;

public class OverridingUsingP1 extends OverridingUsing{
	
	String browserName = "Chrome";
	static OverridingUsingP1 obj;
	
	public static void main(String[] args) {
		obj = new OverridingUsingP1();
		obj.initBrowser();
	}
	
	public void initBrowser() {
		WebDriver driver = getBrowserinstance(browserName);
		obj.click();
		obj.getTitle();
	}

}
