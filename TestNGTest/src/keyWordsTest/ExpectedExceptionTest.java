package keyWordsTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExpectedExceptionTest {

	@Test(priority = 1, expectedExceptions = { ArithmeticException.class})
	public void loginTest() {
		//int i = 1 / 0;
		int j[] = new int[10];
		j[100] = 10;
		System.out.println("LoginTest Completed");
	}

}
