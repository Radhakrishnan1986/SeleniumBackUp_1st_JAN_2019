package annatationsTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassTest {

	@BeforeClass
	public void loginDB() {
		System.out.println("DB login Succesfully");
	}
	@AfterClass
	public void logoutDB() {
		System.out.println("DB logout Succesfully");
	}
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
