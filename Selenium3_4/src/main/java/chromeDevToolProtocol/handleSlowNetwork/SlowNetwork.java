package chromeDevToolProtocol.handleSlowNetwork;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.network.Network;
import org.openqa.selenium.devtools.v137.network.model.ConnectionType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SlowNetwork {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();

		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Network.emulateNetworkConditions(false, 20000, 20000, 50, Optional.of(ConnectionType.CELLULAR3G),
				java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));
		driver.get("https://www.way2automation.com");
		driver.close();

	}

}
