package testng.testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGForceValidations {
	@Test
	public void validateTitle() {
		String actualTitle = "Gmail";
		String expectedTitle = "Google";
		Throwable t = new Throwable();
		Assert.fail("Actual message: " + actualTitle + " is not equals to the expected: " + expectedTitle, t);
	}
}
