package seleniumInDepth.handleDropDownSelectClass;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClassSendKeys {
	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger(SelectClassSendKeys.class);

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		driver = new ChromeDriver();
		log.info("WebDriver Started!!");
		driver.get("https://www.way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("country")).sendKeys("Germany");
		log.info("Country is selected !!");
		driver.close();
		log.info("WebDriver is closed");
	}

}
