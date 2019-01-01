package actionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/resizable/");
		wd.switchTo().frame(0);
		WebElement resize = wd.findElement(By.xpath("html/body/div[1]/div[3]"));
		Actions a = new Actions(wd);
		a.clickAndHold(resize).build().perform();
		a.moveToElement(resize, 80, 80).build().perform();
		a.release(resize).build().perform();
	}

}
