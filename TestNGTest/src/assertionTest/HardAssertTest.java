package assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {

	@Test
	public static void logintest() {
		System.out.println("Initiated");
		String actual = "Amazon";
		String expected = "Flipkart";
		Assert.assertEquals(actual, expected);
		System.out.println("Completed");

	}
}