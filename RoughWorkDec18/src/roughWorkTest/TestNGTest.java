package roughWorkTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestNGTest implements IRetryAnalyzer {

	private int count =0;
	private int maxcount = 3;
	
	@Override
	public boolean retry(ITestResult iTestResults) {
	if(!iTestResults.isSuccess()) {
		if(count<maxcount) {
			iTestResults.setStatus(ITestResult.FAILURE);
			return true;
		}
		else {
			iTestResults.setStatus(ITestResult.FAILURE);
		}}
		else {
			iTestResults.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}

	
}
