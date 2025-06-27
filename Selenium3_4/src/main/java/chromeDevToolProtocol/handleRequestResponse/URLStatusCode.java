package chromeDevToolProtocol.handleRequestResponse;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.network.Network;
import org.openqa.selenium.devtools.v137.network.model.Headers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URLStatusCode {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		DevTools tool = ((ChromeDriver) driver).getDevTools();
		tool.createSession();
		tool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		tool.addListener(Network.requestWillBeSent(), request -> {
			Headers head = request.getRequest().getHeaders();

			if (!head.isEmpty()) {
				System.out.println("Request Headers: ");
				head.forEach((key, value) -> {
					System.out.println("  " + key + " = " + value);
				});
			}
		});

		tool.addListener(Network.responseReceived(), response -> {
			Headers head = response.getResponse().getHeaders();
			if (!head.isEmpty()) {
				System.out.println("Response Headers: ");
				head.forEach((key, value) -> {
					System.out.println("  " + key + " = " + value);
				});

				System.out.println("URL is: " + response.getResponse().getUrl() + " : " + " Sataus is: "
						+ response.getResponse().getStatus());
			}
		});
		driver.get("https://www.flipkart.com");
		driver.close();

	}

}
