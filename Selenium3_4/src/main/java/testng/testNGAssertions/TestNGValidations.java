package testng.testNGAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGValidations {

	@Test
	public void validateTitle() {
		WebDriver driver = new ChromeDriver();
		String actualTitle = "Gmail";
		String expectedTitle = "Google";

		// Java Validation: Drawback never get failure result

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Result is true");
		} else {
			System.out.println("Result is false");
		}

		// TestNG Validation:
		Assert.assertFalse(isElementIsPresent(driver, "//input[@id='identifier']"));
		Assert.assertEquals(actualTitle, expectedTitle, "Actual message is not equal to the expected");
	}

	public boolean isElementIsPresent(WebDriver driver, String path) {
		return driver.findElement(By.xpath(path)).isDisplayed();
	}

}
