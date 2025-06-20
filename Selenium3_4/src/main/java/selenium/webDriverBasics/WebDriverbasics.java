package selenium.webDriverBasics;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverbasics {
	public static String browserName = "Chrome";
	public static Logger log = Logger.getLogger(WebDriverbasics.class);

	public static void main(String[] args) {
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("Chrome")) {
		log.info("WebDriverManager Initialize the ChromeDriver");
		WebDriverManager.chromedriver().setup();
		log.info("WebDriverManager Initialize the ChromeDriver Successfully");
		driver = new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("Firefox")) {
			log.info("WebDriverManager Initialize the FirefoxDriver");
			WebDriverManager.firefoxdriver().setup();
			log.info("WebDriverManager Initialize the FirefoxDriver Successfully");
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("Internet Explorer")) {
			log.info("WebDriverManager Initialize the InternetExplorerDriver ");
			WebDriverManager.iedriver().setup();
			log.info("WebDriverManager Initialize the InternetExplorerDriver  Successfully");
			driver = new InternetExplorerDriver();
		}else if(browserName.equalsIgnoreCase("Edge")) {
			log.info("WebDriverManager Initialize the EdgeDriver ");
			WebDriverManager.edgedriver().setup();
			log.info("WebDriverManager Initialize the EdgeDriver  Successfully");
			driver = new EdgeDriver();
		}
		else {
			log.info("WebDriverManager Initialize the SafariDriver ");
			driver = new SafariDriver();
		}
		
		driver.get("https://www.way2automation.com/");
		log.info("WebDriverManager Navigated To: " + "https://www.way2automation.com/");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println("Title length is: " + title.length());
		// driver.close(); // This will close the current browser window (focus window)
		// driver.quit(); // This will close the all browser window on the same session
		String[] titleArray = title.split("\\|");
		/*
		 * for(int i = 0; i< titleArray.length; i++) 
		 * { 
		 * System.out.println(titleArray[i]); 
		 * }
		 */
		System.out.println(titleArray[0]);
		System.out.println(titleArray[1].trim());
		log.info("WebDriverManager Instance Quit");
	}

}
