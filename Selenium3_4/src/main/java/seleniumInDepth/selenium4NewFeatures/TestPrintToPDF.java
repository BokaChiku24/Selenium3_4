package seleniumInDepth.selenium4NewFeatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPrintToPDF {
	public static void main(String[] args) throws IOException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("headless");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Pdf pdf = ((PrintsPage) driver).print(new PrintOptions());
		Files.write(Paths.get("./WebDriverSelenium.pdf"), OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		driver.close();
	}

}
