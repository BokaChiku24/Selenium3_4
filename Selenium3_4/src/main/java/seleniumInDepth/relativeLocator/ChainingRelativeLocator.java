package seleniumInDepth.relativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

/*
 * We can call without RelativeLocator by making it as static while importing
 * import static org.openqa.selenium.support.locators.RelativeLocator.with;
 */

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChainingRelativeLocator {

	public static Logger log = Logger.getLogger(ChainingRelativeLocator.class);
	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		driver = new ChromeDriver();
		log.info("WebDriver Started!!");
		driver.get("https://www.way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.findElement(with(By.tagName("input"))
				.above(By.linkText("Signin"))
				.below(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")))
		        .sendKeys("xcvxvcx");
		driver.close();
	}

}
