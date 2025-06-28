package testngFrameworkAdvance.handleZipFileAndMail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase extends TestBase {

	@Test
	public void doLogin() {

		driver.findElement(By.id("identifierId")).sendKeys("abc@gamil.com");
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",
				driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")));
		Assert.fail("Force fail");
	}

	@Test
	public void composeEmail() {
		Assert.fail("Error in composing mail");
	}
}
