package seleniumInDepth.selenium4NewFeatures;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOptions3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("deviceName", "iPhone X");

		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("mobileEmulation", map);
		option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.selenium.dev");
		// driver.quit();

	}
}