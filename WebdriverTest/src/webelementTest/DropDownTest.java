package webelementTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.tamildailycalendar.com/tamil_daily_calendar.php");
		WebElement month = wd.findElement(By.xpath("html/body/div[1]/div/div/table[1]/tbody/tr[4]/td/div/select[2]"));
		Select s = new Select(month);
		s.selectByVisibleText("May");
		// s.selectByIndex(5);
		// s.selectByValue("06");
		/*List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String data = options.get(i).getText();
			System.out.println(data);
		}*/
		WebElement firstselectoption = s.getFirstSelectedOption();
		String data = firstselectoption.getText();
		System.out.println(data);		

	}

}
