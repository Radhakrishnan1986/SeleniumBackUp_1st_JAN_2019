package retryTest;

import org.testng.annotations.Test;

public class sampleTest {
	
	@Test(retryAnalyzer= RetryTest.class)
	public void loginTest() {
		System.out.println("Validate login Test");
		int i = 1/0;
	}

}
