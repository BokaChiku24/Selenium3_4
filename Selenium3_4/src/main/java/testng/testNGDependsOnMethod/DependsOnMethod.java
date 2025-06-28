package testng.testNGDependsOnMethod;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(dependsOnMethods = {"doUserRegister","doUserRegisterOTP"})
	public void doLogin() {
		System.out.println("Login to the website..");
	}

	@Test(dependsOnMethods = "launchBrowser")
	public void doUserRegister() {
		System.out.println("User registration complete..");
	}

	@Test(dependsOnMethods = "launchBrowser",alwaysRun = false)
	public void doUserRegisterOTP() {
		System.out.println("User registration complete via OTP..");
	}

	@Test
	public void launchBrowser() {
		System.out.println("Chrome, Firefox...");
	}

}
