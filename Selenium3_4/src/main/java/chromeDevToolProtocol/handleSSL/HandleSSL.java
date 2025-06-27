package chromeDevToolProtocol.handleSSL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.security.Security;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSSL {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		/*
		 * ChromeDriver driver = new ChromeDriver(); 
		 * DevTools tool = driver.getDevTools();
		 */
		WebDriver driver = new ChromeDriver();
		DevTools tool = ((ChromeDriver) driver).getDevTools();
		tool.createSession();

		tool.send(Security.enable());
		tool.send(Security.setIgnoreCertificateErrors(true));
		driver.get("https://expired.badssl.com");
		driver.close();

	}

}
