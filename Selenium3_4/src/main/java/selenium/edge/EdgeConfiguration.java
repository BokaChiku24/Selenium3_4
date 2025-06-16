package selenium.edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeConfiguration {

	public static void main(String[] args) {

		// Selenium 3.x
		System.setProperty("webdriver.chrome.driver", "/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/msedgedriver");
		
		// Selenium 4.x
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
