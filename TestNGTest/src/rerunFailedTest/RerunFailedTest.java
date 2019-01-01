package rerunFailedTest;

import org.testng.annotations.Test;

public class RerunFailedTest {

	@Test
	public void logintest() {
		System.out.println("Login Completed");
		int a[] = new int [2];
		a[3] = 10;
	}
	
	@Test
	public void bookingtest() {
		System.out.println("Booking completed");
		//int i = 1/0;
	}
}
