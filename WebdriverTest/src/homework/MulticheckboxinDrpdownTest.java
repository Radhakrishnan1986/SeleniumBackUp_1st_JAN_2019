package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MulticheckboxinDrpdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("file:///D:/RK/WebelementsfromVinoth/DropdownCheckBox.html");
		WebElement dropdown = wd.findElement(By.xpath("html/body/div[4]/div/div[1]"));
		
		Select s = new Select(dropdown);
		s.selectByVisibleText("WPF Controls");
		//s.deselectByIndex("");
		//s.selectByValue("");

	}

}
