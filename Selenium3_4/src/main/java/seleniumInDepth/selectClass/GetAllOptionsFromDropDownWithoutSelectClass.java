package seleniumInDepth.selectClass;

import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllOptionsFromDropDownWithoutSelectClass {
	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger(GetAllOptionsFromDropDownWithoutSelectClass.class);

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		driver = new ChromeDriver();
		log.info("WebDriver Started!!");
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> list = driver.findElements(By.xpath("//select[@id='searchLanguage']//option"));
		System.out.println("Dropdown size: " + list.size()); // 0 - n-1(75-1=74)
		System.out.println(list.get(10).getText());
		for (WebElement lists : list) {
			System.out.println(lists.getText());
		}
		driver.close();
		log.info("WebDriver Closed!!");

	}

}
