package browserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Javasample2 {

	public static final String USERNAME = "radhakrishnan22";
	public static final String AUTOMATE_KEY = "sMpwqgxKLKVz1stVsZfm";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static WebDriver wd;
	
	
	@Parameters({ "Device" })
	@BeforeTest
	public void setup(String Browser) throws MalformedURLException {
		if (Browser.equals("iPhone8Plus")) {
			DesiredCapabilities		caps = new DesiredCapabilities();
		    caps.setCapability("browserName", "iPhone");
		    caps.setCapability("device", "iPhone 8 Plus");
		    caps.setCapability("realMobile", "true");
		    caps.setCapability("os_version", "11.0");
			wd = new RemoteWebDriver(new URL(URL), caps);
			
		} else if (Browser.equals("iPhone7")) {
			System.out.println("test2");
			DesiredCapabilities		caps = new DesiredCapabilities();
			caps.setCapability("browserName", "iPhone");
			caps.setCapability("device", "iPhone 7");
			caps.setCapability("realMobile", "true");
			caps.setCapability("os_version", "10.3");
			wd = new RemoteWebDriver(new URL(URL), caps);
		}
	}

	@Test
	public void sample() throws Exception {

		wd.get("https://www.bing.com/");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("abc");
		input.submit();
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().forward();
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().refresh();

		wd.quit();

	}
}
