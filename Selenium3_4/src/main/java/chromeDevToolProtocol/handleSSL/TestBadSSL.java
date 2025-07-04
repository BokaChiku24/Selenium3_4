package chromeDevToolProtocol.handleSSL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.security.Security;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBadSSL {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();

		devTools.send(Security.enable());
		devTools.send(Security.setIgnoreCertificateErrors(true));

		driver.get("https://expired.badssl.com");

	}
}
