package seleniumInDepth.Selenium4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabNewWindow {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().driverVersion("138.0.7204.50").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");
		driver.findElement(By.cssSelector("div[jsname='gLFyf'] > .gLFyf")).sendKeys("Selenium");
		driver.findElement(By.xpath("//div[@jsname='erkvQe']/div[@class='OBMEnb']//li[1]")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazone.com");

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.gmail.com");
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getWindowHandles().size());

		String currentWindow = driver.getWindowHandle();
		System.out.println("Current Window Address: " + currentWindow);
		Set<String> handles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		Iterator<String> itr = handles.iterator();
		while (itr.hasNext()) {
			list.add(itr.next());
		}

		driver.switchTo().window(list.get(0));
		System.out.println("First Window: " + driver.getTitle());
		driver.close();

		driver.switchTo().window(list.get(1));
		System.out.println("Second Window: " + driver.getTitle());
		driver.close();

		driver.switchTo().window(list.get(2));
		System.out.println("Third Window: " + driver.getTitle());
		driver.close();

		driver.switchTo().window(list.get(3));
		System.out.println("Forth Window: " + driver.getTitle());
		driver.close();

		driver.quit();
	}

}
