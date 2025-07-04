package testngFrameworkAdvance.handleParallelExecution;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	@Parameters({ "Browser Name" })
	@Test
	public void doLogin(String browserName) {
		Date d = new Date();
		System.out.println("Browser name is: " + browserName + "--" + d);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
