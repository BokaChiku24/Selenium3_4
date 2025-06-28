package testng.testNGParameterization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {
	WebDriver driver = null;

	@Parameters({ "Browser Name", "Environment" })
	@Test
	public void getBrowser(String browserName, String environment) {

		if (browserName.equals("Firefox") && environment.equals("QA")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("Chrome") && environment.equals("QA")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			driver = new SafariDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.close();
	}

}
