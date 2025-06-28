package testng.testNGHandleDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization {

	@Test(dataProvider = "getData")
	public void login(String username, String password) {
		System.out.println("Username is: " + username + " : " + "Password is: " + password);
	}

	@DataProvider(name="getData")
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "traine@way2automation.com";
		data[0][1] = "abcd";

		data[1][0] = "jkhj@way2automation.com";
		data[1][1] = "dfgdfg";

		data[2][0] = "fdgd@way2automation.com";
		data[2][1] = "dfgdfg";
		return data;
	}

}
