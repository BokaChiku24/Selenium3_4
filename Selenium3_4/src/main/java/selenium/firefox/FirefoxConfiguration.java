package selenium.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxConfiguration {

	public static void main(String[] args) {
		
		// For Selenium 3.x need to mention System.setProperty() to declare driver path. 
		System.setProperty("webdriver.gecko.driver", "/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/geckodriver");
		
		/*
		 * Note: In Selenium 3.x if we don't specify System.setProperty() and driver path then we will 
		 *       receive IllegegalStateException: The path to the drive executable must be by 
		 *       the webDriver.gecko.driver
		 */
		
		// For Selenium 4.X No need to mention System.setPropery() path for the driver
		// In Selenium 4.x we can declare path or we don't declare path, it will directly download latest files
		WebDriver driver = new FirefoxDriver();
		System.out.println("Browser Launched...");
		driver.get("https:www.google.com");
		driver.quit();
		System.out.println("Browser Closed...");

	}

}
