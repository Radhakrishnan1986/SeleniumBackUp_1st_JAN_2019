package keyWordsTest;

import org.testng.annotations.Test;

public class DependsOnTest {

	@Test(priority=1)
	public void loginTest() {
		System.out.println("LoginTest Completed");
		int i = 1/0;
	}
	@Test(priority=2, dependsOnMethods="loginTest")
	public void RegistrationTest() {
		System.out.println("RegistrationTest Completed");
	}
	@Test(priority=3, dependsOnMethods="RegistrationTest")
	public void bookingTest() {
		System.out.println("bookingTest Completed");
	}
	@Test(priority=4, dependsOnMethods="bookingTest")
	public void cancelTest() {
		System.out.println("cancelTest Completed");
	}

}
