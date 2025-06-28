package testng.testNGAnnotation;

import org.testng.annotations.BeforeSuite;

public class TestBeforeSuite {

	@BeforeSuite
	public void setup() {
		System.out.println("Initializing Everything..");
	}
	
}
