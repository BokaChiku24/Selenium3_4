package chromeDevToolProtocol.handleRequestResponse;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.network.Network;
import org.openqa.selenium.devtools.v137.network.model.Headers;

public class RequestResponse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kunalchavan/git/Selenium3_4/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		DevTools tool = ((ChromeDriver) driver).getDevTools();
		tool.createSession();
		tool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		tool.addListener(Network.requestWillBeSent(), request -> {
			Headers head = request.getRequest().getHeaders();
			if (!head.isEmpty()) {
				System.out.println("Request Header: ");
				head.forEach((key, value) -> {
					System.out.println(" " + key + " : " + value);
				});
			}
		});

		tool.addListener(Network.responseReceived(), response -> {
			Headers head = response.getResponse().getHeaders();
			if (!head.isEmpty()) {
				System.out.println("Response Header: ");
				head.forEach((key, value) -> {
					System.out.println(" " + key + " : " + value);
				});
			}
		});
		driver.get("https://reqres.in/api/users?page=2");
		driver.close();
	}
}
