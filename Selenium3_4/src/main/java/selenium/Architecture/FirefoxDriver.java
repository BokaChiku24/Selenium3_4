package selenium.Architecture;

public class FirefoxDriver implements WebDriver {

	@Override
	public void sendkeys() {
		System.out.println("Send Keys with FirefoxDriver");
	}

	@Override
	public void close() {
		System.out.println("Close browser with FirefoxDriver");
	}

	@Override
	public void quit() {
		System.out.println("Quit browser with FirefoxDriver");
	}

	@Override
	public void get() {
		System.out.println("Navigate with FirefoxDriver");
	}

	@Override
	public void getTitle() {
		System.out.println("Navigate with FirefoxDriver");
	}

}
