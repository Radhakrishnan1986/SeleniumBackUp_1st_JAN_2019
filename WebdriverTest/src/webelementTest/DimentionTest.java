package webelementTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DimentionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bobcat.com/index");
		Thread.sleep(6000);
		Dimension d = new Dimension(250, 800);
		wd.manage().window().setSize(d);
	}

}
