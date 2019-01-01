package browserStack;

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class JavaSample {

	public static final String USERNAME = "radhakrishnan22";
	public static final String AUTOMATE_KEY = "sMpwqgxKLKVz1stVsZfm";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "iPhone");
		caps.setCapability("device", "iPhone 8");
		caps.setCapability("realMobile", "true");
		caps.setCapability("os_version", "11.0");
		//caps.setCapability("browserstack.local", "true");
		//caps.setCapability("browserstack.localIdentifier", "Test123");
		caps.setCapability("browserstack.debug", true);

		WebDriver wd = new RemoteWebDriver(new URL(URL), caps);
		wd.get("http://www.google.com");
		WebElement element = wd.findElement(By.name("q"));

		element.sendKeys("BrowserStack");
		element.submit();
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\GRID\\Screenshot\\sample.jpg"));

		System.out.println(wd.getTitle());
		wd.quit();

	}
}
