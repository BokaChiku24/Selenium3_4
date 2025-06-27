package chromeDevToolProtocol.handleBlockNetworkRequest;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v136.network.Network;

import com.google.common.collect.ImmutableList;

public class BlockNetworkRequest {

	/*
	 * Block Network - It is used to block all images loading to speed up execution
	 *                 It helps to boost regression, smoke testing
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		DevTools tool = ((ChromeDriver) driver).getDevTools();
		tool.createSession();
		tool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		tool.send(Network.setBlockedURLs(ImmutableList.of("*.jpg", "*.png", "*.jpeg")));
		driver.get("https://makemytrip.com");
		driver.close();
	}

}
