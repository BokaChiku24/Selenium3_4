package seleniumInDepth.presenceOfElements;

import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresent {
	/*
	 * isSelected - Checks options, radio button, dropDown value is selected or not (return  - boolean value)
	 * isEnabled - Checks WebElement is enable or disable on the DOM
	 * isDisplayed - Checks visibility of the WebElement on the DOM.
	 * How to check the presence of the WebElement ? There is no method in the webDriver to check the presence of the WebElement. But we can 
	 * write the custom method
	 */
	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger(ElementPresent.class);

	public static boolean isElementPresent(String locator) {
		try {
			driver.findElement(By.xpath(locator));
			return true;
		} catch (Throwable t) {
			return false;
		}
	}
	
	public static boolean isElementsPresent(String locator) {
		try {
			List<WebElement> list = driver.findElements(By.xpath(locator));
			if(list.size()>0) {
				return true;

			}else {
				return false;
			}
		} catch (Throwable t) {
		  return false;	
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		driver = new ChromeDriver();
		log.info("WebDriver Started!!");
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(
				"Element is Presen: " + driver.findElement(By.cssSelector("a[id='js-link-box-en']")).isDisplayed());
		System.out.println(isElementPresent("a[id='js-link-box-en']12")); // false
		driver.close();
	}

}
