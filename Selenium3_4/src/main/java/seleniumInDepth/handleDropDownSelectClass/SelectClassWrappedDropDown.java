package seleniumInDepth.handleDropDownSelectClass;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassWrappedDropDown {
	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger(SelectClassHandlingElements.class);

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		driver = new ChromeDriver();
		log.info("WebDriver Started!!");
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("searchLanguage")).sendKeys("Español");
		log.info("Country is selected !!");
		Select selectDropdown = new Select(driver.findElement(By.id("searchLanguage")));
		System.out.println(selectDropdown.getFirstSelectedOption().getText());
		driver.close();
		log.info("WebDriver is closed");
	}

}
