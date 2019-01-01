package keyWordsTest;

import org.testng.annotations.Test;

public class InvocationTimeOut {

	@Test(priority=1, invocationTimeOut=5000)
	public void loginTest() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("LoginTest Completed");
	}
	
	
}
