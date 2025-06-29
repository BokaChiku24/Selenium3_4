package chromeDevToolProtocol.handleSimulateDevice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDeviceMetrics {

	@SuppressWarnings("serial")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();

		/*
		 * devTools.send(Emulation.setDeviceMetricsOverride(375, 
		 * 812, 
		 * 50, 
		 * true,
		 * Optional.empty(), 
		 * Optional.empty(), 
		 * Optional.empty(), 
		 * Optional.empty(),
		 * Optional.empty(), 
		 * Optional.empty(), 
		 * Optional.empty(), 
		 * Optional.empty(),
		 * Optional.empty()));
		 * 
		 */
		Map<String, Object> deviceMetrics = new HashMap<String, Object>() {

			{
				put("width", 375);
				put("height", 812);
				put("mobile", true);
				put("deviceScaleFactor", 50);
			}

		};

		((ChromeDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);

		driver.get("https://selenium.dev/");

	}

}
