package webelementTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://book.theautomatedtester.co.uk/chapter1");
		WebElement link = wd.findElement(By.xpath("html/body/div[5]"));
		link.click();
		Set<String> s = wd.getWindowHandles();
		Iterator<String> it = s.iterator();

		String parentId = it.next();
		String childId = it.next();
		wd.switchTo().window(childId);
		wd.close();
	}

}
