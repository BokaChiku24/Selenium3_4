package seleniumInDepth.synchIssuesImplicitWait;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ImpicitWait {

	public static Logger log = Logger.getLogger(ImpicitWait.class);
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
		WebElement emailID = driver.findElement(By.id("identifierId"));
		emailID.sendKeys("k.chavan24@gmail.com");
		log.info("Entered EmailId is: " + emailID.getAttribute("value"));
		driver.findElement(By.xpath("//div[@class='O1Slxf']/div[1]/div[@jsname='Njthtb']")).click();
		log.info("Next button is clicked");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("123123");
		driver.findElement(By.id("passwordNext")).click();
		String incorrectPassowrdMessage = driver.findElement(By.xpath("(//div[@jsname='h9d3hd'])[1]")).getText();
		Assert.assertEquals(incorrectPassowrdMessage, "Wrong password. Try again or click Forgot password to reset it.");
		driver.close();
		log.info("WebDriver is Closed !!");

	}

}
