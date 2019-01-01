package actionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/tooltip/");
		wd.switchTo().frame(0);
		WebElement tooltip = wd.findElement(By.xpath("html/body/p[4]/input"));
		String data = tooltip.getAttribute("title");
		System.out.println(data);
		

	}

}
