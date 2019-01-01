package keyWordsTest;

import org.testng.annotations.Test;

public class AlwaysRunTest {

	@Test(priority=1)
	public void loginTest() {
		System.out.println("LoginTest Completed");
		int i = 1/0;
	}
	@Test(priority=2, dependsOnMethods="loginTest", alwaysRun=true)
	public void RegistrationTest() {
		System.out.println("RegistrationTest Completed");
	}

}
