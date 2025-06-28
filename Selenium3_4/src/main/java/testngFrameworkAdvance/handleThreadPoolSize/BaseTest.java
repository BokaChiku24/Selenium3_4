package testngFrameworkAdvance.handleThreadPoolSize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver = null;

	public WebDriver driverInstance(String browserName) {
		if (browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
		} else if (browserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			return driver;
		} else if (browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new ChromeDriver();
			return driver;
		} else {
			System.out.println("Please enter valid browser..");
			return driver;
		}
	}
}
