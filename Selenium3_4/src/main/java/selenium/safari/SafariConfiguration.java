package selenium.safari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariConfiguration {

	public static void main(String[] args) {
		// Selenium 4.x
		WebDriver driver = new SafariDriver();
		driver.get("https://google.com/");
		driver.quit();
	}

}
