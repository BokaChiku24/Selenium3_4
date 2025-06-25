package seleniumInDepth.selenium4NewFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuthenticationBeforeSelenium4 {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().driverVersion("138.0.7204.50").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com"); // admin - userName, admin - password
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Basic Auth")).click();
	}

}
