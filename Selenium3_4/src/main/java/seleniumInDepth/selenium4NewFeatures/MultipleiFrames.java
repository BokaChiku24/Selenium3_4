package seleniumInDepth.selenium4NewFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleiFrames {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().driverVersion("138.0.7204.50").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_frames2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		int iFrameSize = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Frame size is: " + iFrameSize);
		driver.switchTo().frame(0); // Go to the first frame
		driver.findElement(By.xpath("/html/body/button")).click();

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		driver.switchTo().frame(1); // Go to the second frame
		driver.findElement(By.xpath("//*[@id=\"nav_translate_btn\"]/i")).click();

		// driver.switchTo().defaultContent(); - Return to the main window
		// driver.switchTo().frame("iframeResult"); - Go to the frame by using frame name
		driver.switchTo().parentFrame(); // - Return to the parent window from child window
		driver.findElement(By.xpath("/html/body/button")).click();

		System.out.println(driver.findElements(By.tagName("iframe")).size());
	}

}
