package webelementTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://book.theautomatedtester.co.uk/chapter1");
		WebElement link = wd.findElement(By.xpath("html/body/div[5]"));
		link.click();
		Set<String> s = wd.getWindowHandles();
		Iterator<String> it = s.iterator();
		/*
		 * while (it.hasNext()) { 
		 * System.out.println(it.next()); }
		 */
		String parentId = it.next();
		String childId = it.next();
		wd.switchTo().window(childId);
		Thread.sleep(3000);
		WebElement text = wd.findElement(By.xpath("html/body/p[1]"));
		WebElement close = wd.findElement(By.xpath("html/body/p[2]"));
		String data = text.getText();
		System.out.println(data);
		close.click();
		wd.switchTo().window(parentId);
		//wd.switchTo().defaultContent();
		WebElement load = wd.findElement(By.xpath("html/body/div[11]/input"));
		load.click();

	}

}
