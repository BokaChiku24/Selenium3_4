package testngFrameworkAdvance.handleTestFailScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestUtil extends TestBase {

	public static String mailScreenshotPath;

	public static void getScreenshot(String methodName) {
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.HOUR_OF_DAY);

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		mailScreenshotPath = System.getProperty("user.dir") + "/screenshot/" + methodName + "_" + year + "_" + date
				+ "_" + (month + 1) + "_" + day + "_" + min + "_" + sec + ".jpeg";
		try {
			FileUtils.copyFile(srcFile, new File(mailScreenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
