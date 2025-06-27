package seleniumInDepth.handleShadowDOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestShadowDOM {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("chrome://downloads/");

		WebElement root = driver.findElement(By.cssSelector("downloads-manager"));
		/*
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * org.openqa.selenium.remote.ShadowRoot cannot be cast to class
		 * org.openqa.selenium.WebElement (org.openqa.selenium.remote.ShadowRoot and
		 * org.openqa.selenium.WebElement are in unnamed module of loader 'app')
		 * 
		 * Change WebElement to SearchContext Interface
		 */
		SearchContext shadowRoot1 = (SearchContext) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot", root);

		WebElement root2 = shadowRoot1.findElement(By.cssSelector("downloads-toolbar"));
		SearchContext shadowRoot2 = (SearchContext) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot", root2);

		WebElement root3 = shadowRoot2.findElement(By.cssSelector("cr-toolbar"));
		SearchContext shadowRoot3 = (SearchContext) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot", root3);

		WebElement root4 = shadowRoot3.findElement(By.cssSelector("cr-toolbar-search-field"));
		SearchContext shadowRoot4 = (SearchContext) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot", root4);

		shadowRoot4.findElement(By.cssSelector("#searchInput")).sendKeys("Hello");
		driver.close();
	}

}
