package chromeDevToolProtocol.handleOverrideTimezone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.emulation.Emulation;

public class OverrideTimeZone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://whatismytimezone.com/");

		Thread.sleep(5000);

		DevTools tool = ((ChromeDriver) driver).getDevTools();
		tool.createSession();
		tool.send(Emulation.setTimezoneOverride("EST"));
		driver.get("https://whatismytimezone.com/");
		driver.close();
	}

}
