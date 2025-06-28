package testng.testNGReport;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(
				"<a href=\"/Users/kunalchavan/git/Selenium3_4/Selenium3_4/Selenium WebElement ScreenShots/full page screenshot.jpg\" target=\"_blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log(
				"<a href=\"/Users/kunalchavan/git/Selenium3_4/Selenium3_4/Selenium WebElement ScreenShots/full page screenshot.jpg\" target=\"_blank\"><img height=200 width=200 src=\"/Users/kunalchavan/git/Selenium3_4/Selenium3_4/Selenium WebElement ScreenShots/full page screenshot.jpg\"></a>");
		System.out.println("Capture screenshots.." + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Pass.. " + result.getName());
	}
}
