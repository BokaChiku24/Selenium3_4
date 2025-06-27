package seleniumInDepth.handleScreenshots;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {

	public static void getElementScreenshot(WebDriver driver, WebElement element) throws IOException {
		Date d = new Date();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		BufferedImage img = ImageIO.read(src);
		Point p = element.getLocation();
		int width = p.getX();
		int height = p.getY();
		BufferedImage fullScreen = img.getSubimage(p.x, p.y, width, height);
		ImageIO.write(fullScreen, "jpg", src);
		File scrrenshotDes = new File("./Selenium WebElement ScreenShots/elementScreenShot"
				+ d.toString().replace(':', '_').replace(' ', '_') + ".jpg");
		FileUtils.copyFile(src, scrrenshotDes);
	}

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement image = driver.findElement(By.cssSelector(".k1zIA.rSk4se"));
		ElementScreenshot.getElementScreenshot(driver, image);
		driver.close();
	}

}
