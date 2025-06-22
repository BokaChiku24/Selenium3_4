package seleniumInDepth.handleRelativeLocator;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class MultipleRelativeLocators {

	public static Logger log = Logger.getLogger(MultipleRelativeLocators.class);

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> list = driver
				.findElements(with(By.tagName("label")).below(with(By.xpath("(//form[@id='load_form'])[2]/h3"))));
		ArrayList<WebElement> arrayList = new ArrayList<WebElement>(list);
		System.out.println(arrayList.size());
		Iterator<WebElement> itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		driver.close();
	}

}
