package webelementTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		wd.switchTo().frame(0);
		WebElement dropdown = wd.findElement(By.xpath("html/body/form/select"));
		Select s = new Select(dropdown);
		s.selectByIndex(0);
		s.selectByIndex(3);
		List<WebElement> options = s.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
			String data = options.get(i).getText();
			System.out.println(data);
		}
	}

}
