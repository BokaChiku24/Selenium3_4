package testngFrameworkAdvance.handleParallelExecution;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	@Parameters({ "Browser Name" })
	@Test
	public void doLogin(String browserName) {
		System.out.println("Browser name is: " + browserName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
