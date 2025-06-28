package testng.testngAnnotation;

import org.testng.annotations.Test;

public class TestAnnotation {

	/*
	 * @Test execute alphabetically order i.e. Ascending order 
	 * Even though if we maintain order then they are going to execute as per designed
	 */

	@Test
	public void doLogin() {
		System.out.println("Login to the website..");
	}

	@Test
	public void doUserRegister() {
		System.out.println("User registration complete..");
	}

}
