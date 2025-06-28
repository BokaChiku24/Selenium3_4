package testng.testngSoftAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void validateTitle() {
		SoftAssert soft = new SoftAssert();
		System.out.println("Test Begins..");
		String actualTitle = "Gmail";
		String expectedTitle = "Google";
		soft.fail(("Actual message: " + actualTitle + " is not equals to the expected: " + expectedTitle));
		System.out.println("Test Ends..");
		soft.assertAll();

	}
}
