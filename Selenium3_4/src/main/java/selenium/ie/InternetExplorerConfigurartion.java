package selenium.ie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerConfigurartion {

	public static void main(String[] args) {
		// Selenium 3.x
		System.setProperty("webdriver.ie.driver", "/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/IEDriverServer.exe");
		
		//Selenium 4.x
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.quit();

	}

}
