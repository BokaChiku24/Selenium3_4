package chromeDevToolProtocol.handleOverrideTimezone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOverrideTimeZone {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://whatismytimezone.com/");

		Thread.sleep(5000);

		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		devTools.send(Emulation.setTimezoneOverride("EST"));
		driver.get("https://whatismytimezone.com/");
		driver.close();
	}

}
