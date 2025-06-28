package extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	public static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver = new ChromeDriver();
	}

}
