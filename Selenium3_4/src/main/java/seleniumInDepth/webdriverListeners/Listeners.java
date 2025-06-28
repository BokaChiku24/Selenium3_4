package seleniumInDepth.webdriverListeners;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class Listeners implements WebDriverListener {

	public static Logger log = Logger.getLogger(Listeners.class);
	
	public void afterClick(WebElement element) {
		log.info("Clicking on an element ..." + element);
	}

	public void afterQuit(WebDriver driver) {
		log.info("Test execution completed...");

	}

	public void afterGet(WebDriver driver, String url) {
		log.info("Navigated To..." + url);

	}

	public void afterSendKeys(WebElement element, CharSequence... charSequences) {
		log.info("Typing To Element..." + element + " Enetered Keys: " );
		for(int i = 0; i< charSequences.length; i++) {
			System.out.println(charSequences[i]);
		}

	}
}
