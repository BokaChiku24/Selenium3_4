package seleniumInDepth.handleActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("identifierId"));
		ele.sendKeys("Kunal");
		ele.sendKeys(Keys.ENTER);
		driver.close();
		/*
		 * Actions action = new Actions(driver); 
		 * action.sendKeys(Keys.ENTER).perform();
		 *
		 */

	}

}
