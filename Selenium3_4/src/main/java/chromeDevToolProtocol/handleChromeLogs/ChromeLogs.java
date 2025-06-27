package chromeDevToolProtocol.handleChromeLogs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.console.Console;
import org.openqa.selenium.devtools.v137.log.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("deprecation")
public class ChromeLogs {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools tool = ((ChromeDriver) driver).getDevTools();
		tool.createSession();
		tool.send(Log.enable());
		tool.addListener(Log.entryAdded(), entry -> {
			System.out.println("Text is: " + entry.getText());
			System.out.println("Time is: " + entry.getTimestamp());
			System.out.println("Source is: " + entry.getSource());
			System.out.println("Log level is: " + entry.getLevel());
		});

		tool.send(Console.enable());
		tool.addListener(Console.messageAdded(), message -> {
			System.out.println("Text is: " + message.getText());
			System.out.println("Source is: " + message.getSource());
			System.out.println("Log level is: " + message.getLevel());
		});
		driver.get("https://www.flipkart.com");

		// Append the message in the browser console log
		((JavascriptExecutor) driver).executeScript("console.log('This is a sample log')");
		driver.close();
	}

}
