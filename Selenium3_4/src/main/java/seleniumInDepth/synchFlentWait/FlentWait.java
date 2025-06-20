package seleniumInDepth.synchFlentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class FlentWait {

	public static Logger log = Logger.getLogger(FlentWait.class);
	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		driver = new ChromeDriver();
		log.info("WebDriver Started!!");
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("Timeout as the expected condition not met")
				.ignoring(NoSuchElementException.class);
		
		WebElement emailID = driver.findElement(By.id("identifierId"));
		emailID.sendKeys("k.chavan24@gmail.com");
		log.info("Entered EmailId is: " + emailID.getAttribute("value"));
		driver.findElement(By.xpath("//div[@class='O1Slxf']/div[1]/div[@jsname='Njthtb']")).click();
		log.info("Next button is clicked");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@name='Passwd']")))).sendKeys("123123");
		driver.findElement(By.id("passwordNext")).click();
		String incorrectPassowrdMessage = driver.findElement(By.xpath("(//div[@jsname='h9d3hd'])[1]")).getText();
		Assert.assertEquals(incorrectPassowrdMessage, "Wrong password. Try again or click Forgot password to reset it.");
		driver.close();
		log.info("WebDriver is Closed !!");

	}


}
