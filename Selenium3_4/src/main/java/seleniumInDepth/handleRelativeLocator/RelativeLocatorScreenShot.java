package seleniumInDepth.handleRelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorScreenShot {
	public static Logger log = Logger.getLogger(RelativeLocatorScreenShot.class);
	public static File src;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement dropDown = driver.findElement(with(By.tagName("select")));
		src = dropDown.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Selenium WebElement ScreenShots/select_DropDown.jpg"));
		WebElement above = driver.findElement(with(By.tagName("input")).above(with(By.tagName("select"))));
		above.sendKeys("abc");
		src = above.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Selenium WebElement ScreenShots/above dropdown.jpg"));
		WebElement below = driver.findElement(with(By.tagName("input")).below(with(By.tagName("select"))));
		below.sendKeys("cba");
		src = above.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Selenium WebElement ScreenShots/below dropdown.jpg"));
		driver.close();
		log.info("Screnshoot Cpatured !!");
	}

}
