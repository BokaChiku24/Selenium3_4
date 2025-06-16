package selenium.edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeConfiguration {

	public static void main(String[] args) {

		/*
		 * Legacy Edge 18 or less than 18:
		 * Open the cmd command and type:
		 * DISM.exe /Online /Add-Capablitiy /CapabilityName:Microsoft.WebDriver~~~~0.0.1.0
		 * and hit on the enter and it install it in the system then no need to use System.setProperty()
		 * for legacy browser
		 */
		
		// Selenium 3.x
		System.setProperty("webdriver.chrome.driver", "/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/msedgedriver");
		
		// Selenium 4.x
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
