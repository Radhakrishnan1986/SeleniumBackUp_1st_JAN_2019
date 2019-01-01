package webelementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrolldownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.bing.com/");
		WebElement input = wd.findElement(By.xpath(".//*[@id='sb_form_q']"));
		input.sendKeys("abc");
		input.submit();
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1500)");

		/*wd.get("https://www.flipkart.com/search?q=samsung&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("window.scrollBy(0,1500)");*/
	}

}
