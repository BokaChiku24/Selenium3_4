package seleniumInDepth.handleGetAllLinks;

import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger(Links.class);

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		driver = new ChromeDriver();
		log.info("WebDriver Started!!");
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("js-lang-list-button")).click();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total links on the page: " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Link name is: " + list.get(i).getText() + " : " + list.get(i).getAttribute("href"));
		}
		System.out.println("----Footer Links----");
		WebElement footerList = driver.findElement(By.cssSelector("footer[class='footer']"));
		List<WebElement> ftrList = footerList.findElements(By.tagName("a"));
		System.out.println("Footer list link size: " + ftrList.size());
		for (WebElement footer : ftrList) {
			System.out.println("Link text is: " + footer.getText() + "\t" + " -- URL --" + footer.getAttribute("href"));
		}
		driver.close();
	}
}
