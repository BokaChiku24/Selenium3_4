package chromeDevToolProtocol.handleRequestResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.network.Network;
import org.openqa.selenium.devtools.v137.network.model.Headers;

public class CustomHeader {

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
				System.out.println("Request Headers: ");
				head.forEach((key, value) -> {
					System.out.println("Key is: " + key + " : " + " Value is: " + value);
				});
			}
		});
		tool.addListener(Network.responseReceived(), response -> {
			Headers head = response.getResponse().getHeaders();
			if (!head.isEmpty()) {
				System.out.println("Response Headers: ");
				head.forEach((key, value) -> {
					System.out.println("Key is: " + key + " : " + " Value is: " + value);
				});
			}
			System.out.println("URL is: " + response.getResponse().getUrl() + " | " + "Status is: "
					+ response.getResponse().getStatus());
		});

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("customHeaderName", "customHeaderValue");
		map.put("Kunal", "Automation Tester");
		Headers head = new Headers(map);
		tool.send(Network.setExtraHTTPHeaders(head));
		driver.get("https://www.flipkart.com");
		driver.close();
	}

}
