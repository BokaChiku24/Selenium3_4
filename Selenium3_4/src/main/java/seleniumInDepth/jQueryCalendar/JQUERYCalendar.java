package seleniumInDepth.jQueryCalendar;

import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQUERYCalendar {

	static int targetDay = 0, targetMonth = 0, targetYear = 0;

	static int currentDay = 0, currentMonth = 0, currentYear = 0;

	static int jumpMonthsBy = 0;

	static boolean increment = true;

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Target Date - Day, Month, Year 
		 * Current Date - Day, Month, Year 
		 * Jump To The Month 
		 * Increment Or Decrement
		 */
		String dateToSet = "24/09/2025";
		getCurrentDateMonthYear();
		System.out.println("Current Day: " + currentDay);
		System.out.println("Current Month: " + currentMonth);
		System.out.println("Current Year: " + currentYear);
		getTargetDateMonthYear(dateToSet);
		System.out.println("Target Day: " + targetDay);
		System.out.println("Target Month: " + targetMonth);
		System.out.println("Target Year: " + targetYear);
		calculateHowManyMonthsToJump();
		System.out.println("Jump Month By Value: " + jumpMonthsBy);
		System.out.println("Increment Value Is: " + increment);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.way2automation.com/way2auto_jquery/datepicker/defult1.html");
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		for (int i = 0; i < jumpMonthsBy; i++) {

			if (increment) {

				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]")).click();

			} else {

				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]")).click();

			}

			Thread.sleep(1000);

		}

		driver.findElement(By.linkText(Integer.toString(targetDay))).click();
		driver.close();


	}

	public static void getCurrentDateMonthYear() {
		Calendar cal = Calendar.getInstance();
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH) + 1;
		currentYear = cal.get(Calendar.YEAR);
	}

	public static void getTargetDateMonthYear(String date) {
		int firstIndex = date.indexOf("/");
		int lastIndex = date.lastIndexOf("/");

		String day = date.substring(0, firstIndex);
		targetDay = Integer.parseInt(day);

		String month = date.substring(firstIndex + 1, lastIndex);
		targetMonth = Integer.parseInt(month);

		String year = date.substring(lastIndex + 1, date.length());
		targetYear = Integer.parseInt(year);
	}

	public static void calculateHowManyMonthsToJump() {
		if (targetMonth - currentMonth > 0) {
			jumpMonthsBy = targetMonth - currentMonth;
		} else {
			jumpMonthsBy = currentMonth - targetMonth;
			increment = false;
		}
	}
}
