package gridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridTest {

	WebDriver wd;

	String FirstNodeUrl, FirstNodeIp, SecondNodeUrl, SecondNodeIp;

	@BeforeTest
	public void gridtest() throws MalformedURLException {
		FirstNodeUrl = "http://www.justdial.com/";
		SecondNodeUrl = "http://www.seleniumhq.org/";
		FirstNodeIp = "http://192.168.43.187:4444/wd/hub";
		SecondNodeIp = "http://192.168.43.187:4444/wd/hub";
		//FirstNodeIp = "http://10.53.9.114:4444/wd/hub";
		//SecondNodeIp = "http://10.53.9.136:4444/wd/hub";
		// DesiredCapabilities capability=DesiredCapabilities.firefox();
		// capability.setBrowserName("firefox");
		// capability.setPlatform(Platform.WINDOWS);
		// driver=new RemoteWebDriver(new URL(NodeUrl),capability);

	}

	@AfterTest

	public void gridafterTest() {

		System.out.println("TEST");
		// driver.quit();
	}

	@Test
	public void gridtest1() throws MalformedURLException {
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WINDOWS);
		wd = new RemoteWebDriver(new URL(FirstNodeIp), capability);

		wd.get(FirstNodeUrl);
	}

	@Test
	public void gridtest2() throws MalformedURLException {
		DesiredCapabilities capability1 = DesiredCapabilities.firefox();
		capability1.setBrowserName("firefox");
		capability1.setPlatform(Platform.WINDOWS);
		wd = new RemoteWebDriver(new URL(SecondNodeIp), capability1);

		wd.get(SecondNodeUrl);
	}

}