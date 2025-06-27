package seleniumInDepth.handleShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {
	/*
	 * Shadow DOM - If the Shadow DOM is open then only we can automate it e.g. #shadow-root (open)
	 *              If the Shadow DOM is closed the we couldn't automate it e.g. #shadow-root (closed)
	 *              To interact with Shadow DOM first find the parent Shadow DOM and find parent tag e.g.downloads-manager
	 *              Then use the JavascriptExecutor to interact with Shadow DOM
	 *              (WebElement) ((JavascriptExecutor)driver).executeScript("return argument[0].shadowRoot", WebElement);
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://downloads/");
		driver.manage().window().maximize();
		WebElement root1 = driver.findElement(By.cssSelector("downloads-manager"));
		SearchContext shadowRoot1 = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot", root1);
		WebElement root2 = shadowRoot1.findElement(By.cssSelector("downloads-toolbar"));
		SearchContext shadowRoot2 = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot", root2);
		WebElement root3 = shadowRoot2.findElement(By.cssSelector("cr-toolbar"));
		SearchContext shadowRoot3 = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot", root3);
		WebElement root4 = shadowRoot3.findElement(By.cssSelector("cr-toolbar-search-field"));
		SearchContext shadowRoot4 = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot", root4);
		shadowRoot4.findElement(By.cssSelector("input#searchInput")).sendKeys("Hello");
		driver.close();

	}

}
