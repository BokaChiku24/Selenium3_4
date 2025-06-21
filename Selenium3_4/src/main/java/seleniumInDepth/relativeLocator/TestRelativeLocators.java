package seleniumInDepth.relativeLocator;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestRelativeLocators {
	public static Logger log = Logger.getLogger(TestRelativeLocators.class);
	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		driver = new ChromeDriver();
		log.info("WebDriver Started!!");
		driver.get("https://www.way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		above.sendKeys("k.chavan24@gmail.com");
		WebElement below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
		below.sendKeys("Pune");
		WebElement rightOf = driver
				.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("(//fieldset)[9]/label")));
		rightOf.sendKeys("123213");
		WebElement leftOf = driver.findElement(
				RelativeLocator.with(By.xpath("(//fieldset)[8]/label")).toLeftOf(By.xpath("(//fieldset)[8]/input")));
		System.out.println(leftOf.getText());
		WebElement near = driver
				.findElement(RelativeLocator.with(By.partialLinkText("ENTER TO THE")).near(By.linkText("Signin")));
		near.click();
		driver.close();
	}
}