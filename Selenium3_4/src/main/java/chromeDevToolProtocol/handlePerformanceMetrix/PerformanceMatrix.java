package chromeDevToolProtocol.handlePerformanceMetrix;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.performance.Performance;
import org.openqa.selenium.devtools.v137.performance.model.Metric;

public class PerformanceMatrix {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		DevTools tool = ((ChromeDriver) driver).getDevTools();
		tool.createSession();
		tool.send(Performance.enable(Optional.of(Performance.EnableTimeDomain.TIMETICKS)));
		driver.get("https://www.google.com");
		List<Metric> list =  tool.send(Performance.getMetrics());
		list.forEach(metric -> System.out.println(metric.getName() + " : " + metric.getValue()));
		driver.close();
	}

}
