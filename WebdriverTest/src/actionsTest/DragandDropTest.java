package actionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/droppable/");
		wd.switchTo().frame(0);
		WebElement drag = wd.findElement(By.xpath("html/body/div[1]"));
		WebElement drop = wd.findElement(By.xpath("html/body/div[2]"));
		Actions a = new Actions(wd);
		a.dragAndDrop(drag, drop).build().perform();
	}

}
