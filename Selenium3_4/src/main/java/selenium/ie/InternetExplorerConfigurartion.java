package selenium.ie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplorerConfigurartion {

	public static void main(String[] args) {
		// Selenium 3.x
		System.setProperty("webdriver.ie.driver", "/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/IEDriverServer.exe");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		InternetExplorerOptions ieo = new InternetExplorerOptions(dc);
		//Selenium 4.x
		WebDriver driver = new InternetExplorerDriver(ieo);
		driver.get("https://www.google.com");
		driver.quit();

	}

}
