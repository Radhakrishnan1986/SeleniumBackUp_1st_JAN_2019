package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ColorFinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("file:///D:/RK/FilesfromVinoth/inputbox.html");
		WebElement input = wd.findElement(By.xpath("html/body/form/input[1]"));
		input.click();
	}

}
