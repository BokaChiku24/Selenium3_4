package testng.testngAnnotation;

import org.testng.annotations.Test;

public class TestCase extends TestAfterSuite {
	@Test
	public void userRegistration() {
		System.out.println("User Registration Started");
	}
}
