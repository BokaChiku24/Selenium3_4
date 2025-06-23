package seleniumInDepth.handleScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		if (driver instanceof FirefoxDriver) {
			// Full Page screenshot FirefoxDriver
			File fullPageScreenshot = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fullPageScreenshot,
					new File("./Selenium WebElement ScreenShots/Firefox full page screenshot.jpg"));
			
			// Full Page screenshot FirefoxDriver
						File pageScreenshot = ((HasFullPageScreenshot) driver).getFullPageScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(pageScreenshot, new File("./Selenium WebElement ScreenShots/HasFullPageScreenshot.jpg"));
		} else if (driver instanceof ChromeDriver) {
			// Full Page screenshot FirefoxDriver
			File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(pageScreenshot, new File("./Selenium WebElement ScreenShots/Chrome visible area screenshot.jpg"));
		}

		driver.quit();
	}

}
