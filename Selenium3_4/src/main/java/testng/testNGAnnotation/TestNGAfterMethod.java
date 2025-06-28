package testng.testNGAnnotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAfterMethod {
	/*
	 * @BeforeMethod: This annotation is use to execute method before each and every test.
	 * @AfterMethod: This annotation is use to execute method after each and every test.
	 */
	
	@BeforeMethod
	public void setup() {
		System.out.println("WebDriver initiated..");
	}
	
	@Test
	public void doLogin() {
		System.out.println("Login to the website..");
	}

	@Test
	public void doUserRegister() {
		System.out.println("User registration complete..");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("WebDriver closed..");
	}
}
