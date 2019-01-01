package groupingTest;

import org.testng.annotations.Test;

public class GroupingTest {

	@Test(priority=1, groups= {"BOOK", "CANCEL"})
	public void loginTest() {
		System.out.println("LoginTest Completed");
	}
	@Test(priority=2, groups= {"BOOK"})
	public void RegistrationTest() {
		System.out.println("RegistrationTest Completed");
	}
	@Test(priority=3,groups= {"BOOK", "CANCEL"})
	public void bookingTest() {
		System.out.println("bookingTest Completed");
	}
	@Test(priority=4, groups= {"CANCEL"})
	public void cancelTest() {
		System.out.println("cancelTest Completed");
	}

}
