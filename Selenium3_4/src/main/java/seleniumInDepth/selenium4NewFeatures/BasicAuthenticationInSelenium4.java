package seleniumInDepth.selenium4NewFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuthenticationInSelenium4 {
	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().driverVersion("138.0.7204.50").setup();
		WebDriver driver = new ChromeDriver();
		((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Basic Auth")).click();
		driver.quit();
	}
}
