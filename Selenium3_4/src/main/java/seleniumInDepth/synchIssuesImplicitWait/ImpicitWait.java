package seleniumInDepth.synchIssuesImplicitWait;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpicitWait {

	public static Logger log = Logger.getLogger(ImpicitWait.class);
	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

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
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("123123");
		driver.close();
		log.info("WebDriver is Closed !!");
		
	}

}
