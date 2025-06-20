package selenium.Architecture;

public class ChromeDriver implements WebDriver {

	@Override
	public void sendkeys() {
		System.out.println("Send Keys with ChromeDriver");
	}

	@Override
	public void close() {
		System.out.println("Close browser with ChromeDriver");
	}

	@Override
	public void quit() {
		System.out.println("Quit browser with ChromeDriver");
	}

	@Override
	public void get() {
		System.out.println("Navigate with ChromeDriver");
	}

	@Override
	public void getTitle() {
		System.out.println("Navigate with ChromeDriver");
	}


}
