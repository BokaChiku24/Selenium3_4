package seleniumInDepth.handleActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement mainSlider = driver.findElement(By.id("slider"));
		int middle = mainSlider.getSize().width / 2;
		WebElement slider = driver.findElement(By.xpath("//span[@tabindex='0']"));
		new Actions(driver).dragAndDropBy(slider, middle, 0).perform();
		driver.close();
	}

}
