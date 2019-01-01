package keyWordsTest;

import org.testng.annotations.Test;

public class DescriptionTest {
	@Test(priority=1, description="Validating LoginTest")
	public void loginTest() {
		System.out.println("LoginTest Completed");
	}
	@Test(priority=2, description="Validating RegistrationTest")
	public void RegistrationTest() {
		System.out.println("RegistrationTest Completed");
	}
	@Test(priority=3, description="Validation Booking Test")
	public void bookingTest() {
		System.out.println("bookingTest Completed");
	}
	@Test(priority=4, description="Validating CancelTest")
	public void cancelTest() {
		System.out.println("cancelTest Completed");
	}
}
