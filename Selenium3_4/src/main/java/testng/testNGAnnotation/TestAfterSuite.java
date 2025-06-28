package testng.testNGAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestAfterSuite {

	@BeforeSuite
	public void setup() {
		System.out.println("Initializing Everything..");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("Quitting Everything..");
	}
}
