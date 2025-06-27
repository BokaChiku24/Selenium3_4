package chromeDevToolProtocol.handleSimulateDevice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class DeviceMatrices {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		DevTools tool = ((ChromeDriver) driver).getDevTools();
		tool.createSession();
		@SuppressWarnings("serial")
		Map<String, Object> map = new HashMap<String, Object>() {
			{
				put("width", 375);
				put("height", 812);
				put("mobile", true);
				put("deviceScaleFactor", 50);
			}
		};
		((ChromeDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride", map);
		driver.get("https://selenium.dev");
		driver.close();

	}

}
