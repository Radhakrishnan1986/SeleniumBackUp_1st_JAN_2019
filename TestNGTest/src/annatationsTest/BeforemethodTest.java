package annatationsTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforemethodTest {

	@BeforeMethod
	public void openbrowser() {
		System.err.println("Browser opened succesfully");
	}
	@AfterMethod
	public void closebrowser() {
		System.err.println("Verify Browser exists or not");
	}
	@Test(priority=1)
	public void loginTest() {
		System.out.println("LoginTest Completed");
	}
	@Test(priority=2)
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
