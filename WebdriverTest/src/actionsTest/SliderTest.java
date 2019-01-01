package actionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/slider/");
		wd.switchTo().frame(0);
		WebElement slider = wd.findElement(By.xpath("html/body/div[1]/span"));
		Actions a = new Actions(wd);
		a.dragAndDropBy(slider, 80, 0).build().perform();
		
	}

}
