package seleniumInDepth.webdriverListeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EventListeners {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver webDriver = new ChromeDriver();
		WebDriverListener listeners = new Listeners();
		WebDriver driver = new EventFiringDecorator<WebDriver>(listeners).decorate(webDriver);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("password");
		driver.quit();
	}

}
