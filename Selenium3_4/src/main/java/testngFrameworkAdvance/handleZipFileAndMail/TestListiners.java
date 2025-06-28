package testngFrameworkAdvance.handleZipFileAndMail;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.email.MonitoringMail;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListiners extends TestBase implements ITestListener {

	public void onTestFailure(ITestResult result) {
		String name = result.getName().toString().trim();
		TestUtil.getScreenshot(name);
	}

	public void onFinish(ITestContext result) {

		MonitoringMail mail = new MonitoringMail();
		try {
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject,
					TestConfig.messageBody);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
