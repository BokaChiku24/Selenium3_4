package seleniumInDepth.maxMinFullScreen;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MinimizeBrowser {

	public static Logger log = Logger.getLogger(MaximizeBrowser.class);
	public static String browserName = "Chrome";
	public static WebDriver driver = null;

	public static void main(String[] args) {
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/geckodriver");
			driver = new FirefoxDriver();
		} else {
			driver = new SafariDriver();
		}
		log.info("WebDriver Initiated!!");
		driver.manage().window().minimize(); //Minimizes the current window if it is not already minimized
		driver.get("https://www.gmail.com");
		WebElement loginID = driver.findElement(By.id("identifierId"));
		loginID.sendKeys("k.chavan24@gmail.com");
		log.info("EmailID enters: " + loginID.getAttribute("value"));
		driver.close();
		log.info("WebDriver Closed!!");

	}
}