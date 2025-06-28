package extentReports;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report {

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void setupReport() {
		htmlReporter = new ExtentHtmlReporter("./extentReports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Kunal Chavan Automation");
		htmlReporter.config().setReportName("Selenium Report");
		htmlReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("System OS: ", "MAC");
		extent.setSystemInfo("System Browser: ", "Chrome");
		extent.setSystemInfo("Project: ", "Kunal Chavan Automation");
		extent.setSystemInfo("Author: ", "Kunal Chavan");
	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}

	/*
	 * Pass Fail Skip
	 */

	@Test
	public void doLogin() {
		test = extent.createTest("Login Test");
		System.out.println("Executing login test");
	}

	@Test
	public void doLogout() {
		test = extent.createTest("Logout Test");
		System.out.println("Executing logout test");
	}

	@Test
	public void userRegister() {
		test = extent.createTest("User Register Test");
		System.out.println("Executing user register test");
		Assert.fail("Testing fail");
	}

	@Test
	public void isSkip() {
		test = extent.createTest("Skip Test");
		throw new SkipException("Skipping test case");
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {

			String methodName = result.getMethod().getMethodName();
			String logTest = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + " FAILURE" + "</b>";
			Markup m = MarkupHelper.createLabel(logTest, ExtentColor.RED);
			test.fail(m);

		} else if (result.getStatus() == ITestResult.SKIP) {

			String methodName = result.getMethod().getMethodName();
			String logTest = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + " SKIPPED" + "</b>";
			Markup m = MarkupHelper.createLabel(logTest, ExtentColor.ORANGE);
			test.skip(m);

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			String methodName = result.getMethod().getMethodName();
			String logTest = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + " PASSED" + "</b>";
			Markup m = MarkupHelper.createLabel(logTest, ExtentColor.GREEN);
			test.pass(m);

		}
	}
}
