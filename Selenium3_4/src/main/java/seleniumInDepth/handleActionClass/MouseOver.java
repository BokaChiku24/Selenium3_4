package seleniumInDepth.handleActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("way2automation");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(
				ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(.//input[@value='Google Search'])[1]"))));
		driver.findElement(By.xpath("(.//input[@value='Google Search'])[1]")).click();
		*/
		driver.get("https://www.way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("//ul[@id='ast-hf-menu-1']/li[@id='menu-item-27580']"));
		WebElement text = driver.findElement(By.xpath("//span[text()='Lifetime Membership']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		action.moveToElement(text).click().build().perform();
		driver.close();
	}

}
