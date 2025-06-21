package seleniumInDepth.selectClass;

import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassWrappedDropDownPrintAllValue {
	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger(SelectClassWrappedDropDownPrintAllValue.class);

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		driver = new ChromeDriver();
		log.info("WebDriver Started!!");
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select selectDropdown = new Select(driver.findElement(By.id("searchLanguage")));
		List<WebElement> list = selectDropdown.getOptions();
		System.out.println(list.size());
		for (WebElement lists : list) {
			System.out.println(lists.getText());
		}
		log.info("ALl Country is printed !!");
		System.out.println(selectDropdown.getFirstSelectedOption().getText());
		driver.close();
		log.info("WebDriver is closed");
	}
}
