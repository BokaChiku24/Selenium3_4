package testngFrameworkAdvance.handleParallelExecution;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDataProvider {
	@Test(dataProvider = "dataProviderOne")
	public void doLogin(String browserName) {
		Date d = new Date();
		System.out.println("Browser name is: " + browserName + "--" + d);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@DataProvider(name = "dataProviderOne", parallel = true)
	public Object[][] getData() {
		Object[][] data = new Object[2][1];
		data[0][0] = "Chrome";
		data[1][0] = "Firefox";
		return data;
	}
}
