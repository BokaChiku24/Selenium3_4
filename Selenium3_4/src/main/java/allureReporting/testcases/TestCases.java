package allureReporting.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Allure example")
@Feature("TestNG support")
public class TestCases {

	@Test
	@Description("Login Test")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Login Functionality")
	public void doLogin() throws FileNotFoundException {
		System.out.println("Pass");
		FileInputStream file = new FileInputStream(
				"/Users/kunalchavan/git/Selenium3_4/Selenium3_4/Selenium WebElement ScreenShots/Chrome visible area screenshot.jpg");
		Allure.addAttachment("Pass Testcase Name", file);
	}

	@Test
	@Description("User Registration Test")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Registration Functionality")
	public void doUserReg() {
		Assert.fail("Failing test case");
	}

	@Test
	@Description("Skip Test")
	@Severity(SeverityLevel.NORMAL)
	@Story("Skip Functionality")
	public void isSkip() {
		throw new SkipException("Skipping test case");
	}

}
