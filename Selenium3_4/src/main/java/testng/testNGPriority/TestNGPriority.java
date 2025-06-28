package testng.testNGPriority;

import org.testng.annotations.Test;

public class TestNGPriority {
	/*
	 * To execute test cases orderly use the priority 
	 * Lowest priority executes first
	 */
	@Test(priority = 2)
	public void doLogin() {
		System.out.println("Login to the website..");
	}

	@Test(priority = 1)
	public void doUserRegister() {
		System.out.println("User registration complete..");
	}
}
