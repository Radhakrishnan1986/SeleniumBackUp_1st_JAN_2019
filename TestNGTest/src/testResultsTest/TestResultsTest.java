package testResultsTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestResultsTest {

	@Test
	public void logintest() {
		System.out.println("Test completed");
		//System.out.println(password);
	}
	@AfterMethod
	public void tierdown(ITestResult r) {
		System.out.println(r.getEndMillis());		// 1545103202191
		System.out.println(r.getHost());			// null
		System.out.println(r.getInstance());		// testResultsTest.TestResultsTest@2898ac89
		System.out.println(r.getInstanceName());	// testResultsTest.TestResultsTest
		System.out.println(r.getName());			// logintest
		System.out.println(r.getStartMillis());		// 1545103202177
		System.out.println(r.getStatus());			// 1
		System.out.println(r.getTestName());		// null
		System.out.println(r.getAttributeNames());	// []
		System.out.println(r.getClass());			// class org.testng.internal.TestResult
		System.out.println(r.getMethod());			// TestResultsTest.logintest()[pri:0, instance:testResultsTest.TestResultsTest@2898ac89]
		System.out.println(r.getParameters());		// [Ljava.lang.Object;@71def8f8
		System.out.println(r.getTestClass());		// [TestClass name=class testResultsTest.TestResultsTest]
		System.out.println(r.getTestContext());		// org.testng.TestRunner@383bfa16
		System.out.println(r.getThrowable());		// null
	}

}
