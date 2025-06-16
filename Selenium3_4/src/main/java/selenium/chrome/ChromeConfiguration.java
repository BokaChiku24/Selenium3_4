package selenium.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeConfiguration {

	public static void main(String[] args) {
		// Selenium 3.x
		// System.setProperty("webdriver.chrome.driver", "/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		
		/*
		 * Above will work only whens the driver executable file is project root folder. 
		 * Otherwise system will throw IllegalStateException
		 */
		
		//Selenium 4.x
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
