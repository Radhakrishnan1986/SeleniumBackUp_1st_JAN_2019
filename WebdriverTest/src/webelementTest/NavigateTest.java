package webelementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		//wd.get("http://www.bing.com/");
		wd.navigate().to("http://www.bing.com/");
		WebElement input = wd.findElement(By.xpath(".//*[@id='sb_form_q']"));
		input.sendKeys("abc");
		input.submit();
		Thread.sleep(4000);
		wd.navigate().back();
		Thread.sleep(4000);
		wd.navigate().forward();
		Thread.sleep(4000);
		wd.navigate().refresh();
	}

}
