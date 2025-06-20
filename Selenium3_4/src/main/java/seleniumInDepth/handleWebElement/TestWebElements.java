package seleniumInDepth.handleWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("trainer@way2automation.com");
		driver.close();
	}

}
