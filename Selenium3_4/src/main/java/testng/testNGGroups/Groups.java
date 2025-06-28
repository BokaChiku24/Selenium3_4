package testng.testNGGroups;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups = {"Functional","Smoke"})
	public void doLogin() {
		System.out.println("Login to the website..");
	}

	@Test(groups = {"Functional"})
	public void doUserRegister() {
		System.out.println("User registration complete..");
	}

	@Test(groups = {"Functional"})
	public void doUserRegisterOTP() {
		System.out.println("User registration complete via OTP..");
	}

	@Test(groups = {"Regression"})
	public void launchBrowser() {
		System.out.println("Chrome, Firefox...");
	}
}
