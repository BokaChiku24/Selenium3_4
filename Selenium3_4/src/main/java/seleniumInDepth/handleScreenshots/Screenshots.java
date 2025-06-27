package seleniumInDepth.handleScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void takesScreenshot(WebDriver driver) throws IOException {
		Date d = new Date();
		String date = d.toString().replace(':', '_').replace(' ', '_');
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Selenium WebElement ScreenShots/Screen" + date + ".jpg"));
	}

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Screenshots.takesScreenshot(driver);
		driver.close();
	}

}
