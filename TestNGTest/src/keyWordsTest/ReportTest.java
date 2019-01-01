package keyWordsTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest {

	@Test(priority=1)
	public void loginTest() {
		//System.out.println("LoginTest Completed");
		Reporter.log("LoginTest Completed");
	}
	@Test(priority=2)
	public void RegistrationTest() {
		//System.out.println("RegistrationTest Completed");
		Reporter.log("RegistrationTest Completed");
	}
	@Test(priority=3)
	public void bookingTest() {
		//System.out.println("bookingTest Completed");
		Reporter.log("bookingTest Completed");
	}
	@Test(priority=4)
	public void cancelTest() {
		//System.out.println("cancelTest Completed");
		Reporter.log("cancelTest Completed");
	}

}
