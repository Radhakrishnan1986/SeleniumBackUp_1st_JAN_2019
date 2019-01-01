package keyWordsTest;

import org.testng.annotations.Test;

public class SkipTest {

	@Test(priority=1)
	public void loginTest() {
		System.out.println("LoginTest Completed");
	}
	@Test(priority=2,enabled=false)
	public void RegistrationTest() {
		System.out.println("RegistrationTest Completed");
	}
	@Test(priority=3)
	public void bookingTest() {
		System.out.println("bookingTest Completed");
	}
	@Test(priority=4)
	public void cancelTest() {
		System.out.println("cancelTest Completed");
	}

}
