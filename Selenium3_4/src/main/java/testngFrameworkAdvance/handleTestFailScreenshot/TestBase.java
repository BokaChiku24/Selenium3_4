package testngFrameworkAdvance.handleTestFailScreenshot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public static WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		if (driver == null) {
			driver = new FirefoxDriver();
			driver.get("https://www.gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
