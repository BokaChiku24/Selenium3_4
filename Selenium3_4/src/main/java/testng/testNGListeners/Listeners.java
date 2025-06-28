package testng.testNGListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestFailure(ITestResult result) {
		System.out.println("Capture screenshots.." + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Pass.. " + result.getName());
	}
}
