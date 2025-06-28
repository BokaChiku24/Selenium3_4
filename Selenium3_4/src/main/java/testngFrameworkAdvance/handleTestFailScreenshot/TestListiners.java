package testngFrameworkAdvance.handleTestFailScreenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListiners extends TestBase implements ITestListener {

	public void onTestFailure(ITestResult result) {
		String name = result.getName().toString().trim();
		TestUtil.getScreenshot(name);
	}

}
