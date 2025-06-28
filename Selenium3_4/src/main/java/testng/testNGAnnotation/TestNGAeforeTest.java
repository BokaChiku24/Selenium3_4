package testng.testNGAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAeforeTest {
	/*
	 * @BeforeTest: This annotation is use to execute once before any test execute. This runs only once.
	 * @BeforeMethod: This annotation is use to execute method before each and every test.
	 * @AfterTest: This annotation is use to execute once after any test execute. This runs only once.
	 */

	@BeforeTest
	public void setupDBConnection() {
		System.out.println("Database connection initiated..");
	}
	
	
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
	
	@AfterTest
	public void closeDBConnection() {
		System.out.println("Database connection closed..");
	}
}
