package assertionTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsertTest {

	@Test
	public void logintest() {
		System.out.println("Initiated");
		String actual = "Amazon";
		String expected = "flipkart";
		SoftAssert a = new SoftAssert();
		//SoftAsertTest a = new SoftAsertTest();
		a.assertEquals(actual, expected);
		System.out.println("Completed");
		a.assertAll();

	}

}
