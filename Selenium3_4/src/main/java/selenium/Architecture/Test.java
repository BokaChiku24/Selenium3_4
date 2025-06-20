package selenium.Architecture;

public class Test {

	public static String browser = "Firefox";
	public static WebDriver driver = null;

	public static void main(String[] args) {

		if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		driver.close();
		driver.get();
		driver.getTitle();
		driver.quit();
		driver.sendkeys();
	}

}
