package seleniumInDepth.handleSynchIssueThreadSleep;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleepExample {
	public static Logger log = Logger.getLogger(ThreadSleepExample.class);
	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		driver = new ChromeDriver();
		log.info("WebDriver Started!!");
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		WebElement emailID = driver.findElement(By.id("identifierId"));
		emailID.sendKeys("k.chavan24@gmail.com");
		log.info("Entered EmailId is: " + emailID.getAttribute("value"));
		driver.findElement(By.xpath("//div[@class='O1Slxf']/div[1]/div[@jsname='Njthtb']")).click();
		log.info("Next button is clicked");
		Thread.sleep(Duration.ofSeconds(5)); // Not Recommended This Way
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("123123");
		driver.close();
		log.info("WebDriver is Closed !!");
		
	}

}
