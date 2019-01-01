package homework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("file:///D:/RK/WebelementsfromVinoth/mutiwindow.html");
		WebElement button = wd.findElement(By.xpath("html/body/form/input"));
		button.click();
		Thread.sleep(5000);
		Set<String> s = wd.getWindowHandles();
		Iterator<String> it = s.iterator();

		/*
		 * while (it.hasNext()) { System.out.println(it.next()); }
		 */

		String parentId = it.next();
		/*String childId1 = it.next();
		String childId2 = it.next();
		String childId3 = it.next();
		wd.switchTo().window(childId2);
		String data = wd.getTitle();
		System.out.println(data);*/

		while (it.hasNext()) {
			wd.switchTo().window(it.next());
			String data1 = wd.getTitle();
			if(data1.equals("Bing")) {
				System.out.println(data1);				
			}
	
			wd.switchTo().window(parentId);

		}

	}

}
