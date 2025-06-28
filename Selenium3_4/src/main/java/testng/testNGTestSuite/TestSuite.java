package testng.testNGTestSuite;

import org.testng.annotations.Test;

public class TestSuite {
	@Test
	public void doLogin() {
		System.out.println("Login to the website..");
	}

	@Test
	public void doUserRegister() {
		System.out.println("User registration complete..");
	}

	@Test
	public void doUserRegisterOTP() {
		System.out.println("User registration complete via OTP..");
	}

	@Test
	public void launchBrowser() {
		System.out.println("Chrome, Firefox...");
	}
}
