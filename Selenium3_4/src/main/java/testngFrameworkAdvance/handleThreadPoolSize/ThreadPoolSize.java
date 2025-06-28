package testngFrameworkAdvance.handleThreadPoolSize;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThreadPoolSize extends BaseTest {
	public static int count = 0;

	@Parameters({ "Browser Name" })
	@Test(invocationCount = 5, threadPoolSize = 5)
	public void executeTest(String browserName) {
		System.out.print("Test executed --> Now increase the count: ");
		count++;
		System.out.println(count);
		driver = driverInstance(browserName);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.quit();

	}

}
