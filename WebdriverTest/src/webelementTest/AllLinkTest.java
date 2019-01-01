package webelementTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		List<WebElement> links = wd.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			String data = links.get(i).getText();
			if (!data.isEmpty()) {
				System.out.println(data);
			}

		}

	}

}
