package seleniumInDepth.handlingSVGGraphs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraph {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.covid19india.org");
		Thread.sleep(5000); // Temporary handles stale element exception
		// Go to the SVG Graph
		List<WebElement> graphPoints = driver.findElements(
				By.xpath("(//*[name()='svg' and @preserveAspectratio='xMidYMid meet'])[6]//*[local-name()='circle']"));
		Actions action = new Actions(driver);
		for (WebElement point : graphPoints) {
			action.moveToElement(point).perform();
			System.out.println(driver.findElement(By.xpath("//div[@class='status is-confirmed'/div/h2")).getText());
		}
	}

}
