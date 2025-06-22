package seleniumInDepth.handleWebTables;

import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger(Webtable.class);

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		driver = new ChromeDriver();
		log.info("WebDriver Started!!");
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("Navigated to the URl => " + "https://money.rediff.com/gainers");
		System.out.println();
		List<WebElement> rowNo = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total number of rows: " + rowNo.size());
		List<WebElement> columnNo = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total number of columns: " + columnNo.size());
		List<WebElement> columnHead = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		for (int i = 1; i <= columnHead.size(); i++) {
			System.out
					.print(driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th[" + i + "]")).getText()+" \t ");
		}
		System.out.println();
		for (int i = 1; i <= rowNo.size(); i++) {
			if (i == 50)
				break;
			else {
				for (int j = 1; j <= columnNo.size(); j++) {
					System.out.print(driver
							.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + i + "]/td[" + j + "]"))
							.getText() + " \t ");

				}
			}
			System.out.println();
		}
		driver.close();
	}
}
