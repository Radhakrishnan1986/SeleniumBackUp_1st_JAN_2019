package webelementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		//Thread.sleep(5000);
		wd.switchTo().frame(0);
		WebElement f1 = wd.findElement(By.xpath("html/body/form/input[1]"));
		if (f1.isDisplayed()) {
			System.out.println("Is displayed");
		}
		if (f1.isEnabled()) {
			System.out.println("Is Enabled");
		}
		if (!f1.isSelected()) {
			System.out.println("Is not Selected");
			f1.click();
		}
		else {
			System.out.println("Check Box is already selected");
		}
	}
}