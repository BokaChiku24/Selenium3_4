package chromeDevToolProtocol.handleMockGEOLocation;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.emulation.Emulation;
import org.openqa.selenium.devtools.v137.security.Security;

public class MockGEOLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		DevTools tool = ((ChromeDriver) driver).getDevTools();
		tool.createSession();
		tool.send(Security.enable());
		tool.send(Security.setIgnoreCertificateErrors(true));
		tool.send(Emulation.setGeolocationOverride(Optional.of((Number) 51.509865),
				Optional.of((Number) (double) -0.118092), Optional.of((Number) 100), java.util.Optional.empty(),
				java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));
		driver.get("https://mycurrentlocation.net/");
		driver.close();
	}

}
