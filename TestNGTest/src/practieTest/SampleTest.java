package practieTest;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(priority=1, enabled= false)
	public void loginTest() {
		System.out.println("LoginTest Completed");
	}
	@Test(priority=2, dependsOnMethods="loginTest", alwaysRun=true)
	public void RegistrationTest() {
		System.out.println("RegistrationTest Completed");
	}
	
}
