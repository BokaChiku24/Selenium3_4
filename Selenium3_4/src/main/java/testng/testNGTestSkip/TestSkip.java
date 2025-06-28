package testng.testNGTestSkip;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {

	@Test
	public void isTestSkip() {
		throw new SkipException("Skipping the test on purpose");
	}

}
