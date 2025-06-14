package org.java.polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OverridingUsing {

	// WebDriver return type is Polymorpic return
	public WebDriver getBrowserinstance(String browserName) {
		if (browserName.equals("Firefox")) {
			return new FirefoxDriver();
		} else if (browserName.equals("Chrome")) {
			return new ChromeDriver();
		} else if (browserName.equals("Edge")) {
			return new EdgeDriver();
		} else {
			return new SafariDriver();
		}
	}
	
	public void click() {
		System.out.println("Performing Click - WebDriver()");
	}
	
	public void sendKeys() {
		System.out.println("Performing sendKeys - WebDriver()");
	}
	
	public void getTitle() {
		System.out.println("Performing getTitle - WebDriver()");
	}

}
