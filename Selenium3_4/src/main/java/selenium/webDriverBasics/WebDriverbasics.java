package selenium.webDriverBasics;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverbasics {

	static Logger log = Logger.getLogger(WebDriverbasics.class);
	public static void main(String[] args) {
		log.info("WebDriverManager Initialize the ChromeDriver");
		WebDriverManager.chromedriver().setup();
		log.info("WebDriverManager Initialize the ChromeDriver Successfully");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		log.info("WebDriverManager Navigated To: " + "https://www.way2automation.com/");
		driver.quit();
		log.info("WebDriverManager Instance Quit");
	}

}
