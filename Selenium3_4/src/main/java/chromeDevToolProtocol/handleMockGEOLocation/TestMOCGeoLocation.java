package chromeDevToolProtocol.handleMockGEOLocation;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMOCGeoLocation {
	 
	public static void main(String[] args) {
 
		//https://chromedevtools.github.io/devtools-protocol/tot/Emulation/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		
		
		devTools.send(Emulation.setGeolocationOverride(Optional.of(51.509865), Optional.of(-0.118092), Optional.of(100),
				java.util.Optional
						.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));
		
		driver.get("https://mycurrentlocation.net/");
		
 
	}
}
