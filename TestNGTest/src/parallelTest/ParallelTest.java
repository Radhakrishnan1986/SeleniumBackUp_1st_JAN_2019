package parallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver wd;

	@Parameters({ "Browser" })
	@BeforeTest
	public void setup(String Browser) {
		if (Browser.equals("FIREFOX")) {
			wd = new FirefoxDriver();
		} else if (Browser.equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
			wd = new ChromeDriver();
		}
	}

	@Test
	public void bingtest() throws InterruptedException {

		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement input = wd
				.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/input[1]"));
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
	}

}
