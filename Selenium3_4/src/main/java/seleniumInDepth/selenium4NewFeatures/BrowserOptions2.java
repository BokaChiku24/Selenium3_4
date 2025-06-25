package seleniumInDepth.selenium4NewFeatures;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserOptions2 {
	public static String browser = "Chrome";
	public static WebDriver driver = null;

	public static void main(String[] args) {

		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/geckodriver");
			FirefoxOptions fireOption = new FirefoxOptions();
			// fireOption.addArguments("--headless");
			fireOption.setAcceptInsecureCerts(true);
			fireOption.addArguments("window-size=1080,1080");
			fireOption.addArguments("incognito");
			driver = new FirefoxDriver(fireOption);
		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
			ChromeOptions chromeOption = new ChromeOptions();
			// chromeOption.addArguments("--headless");
			chromeOption.setAcceptInsecureCerts(true);
			chromeOption.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			chromeOption.addArguments("window-size=1080,1080");
			chromeOption.addArguments("incognito");
			driver = new ChromeDriver(chromeOption);
		}

		driver.get("https://expired.badssl.com/");
		System.out.println((driver.getTitle()));
		driver.close();
	}

}
