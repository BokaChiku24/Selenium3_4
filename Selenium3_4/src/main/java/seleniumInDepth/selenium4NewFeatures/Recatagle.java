package seleniumInDepth.selenium4NewFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recatagle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logo = driver.findElement(By.xpath(".//div[@class='Wf6lSd']"));
		Rectangle rect = logo.getRect();
		System.out.println("Height is: " + rect.height + " : " + "Wedith is: " + rect.width + " : " + "X Co-ordinate: "
				+ rect.getX() + " : " + "Y Co-ordinate: " + rect.getY());
		/*
		 * Selenium 3.x approach
		 */
		System.out.println("Selenium 3 Get X Co-ordinate: " + logo.getLocation().getX());
		System.out.println("Selenium 3 Get Y Co-ordinate: " + logo.getLocation().getY());
		driver.close();
	}

}
