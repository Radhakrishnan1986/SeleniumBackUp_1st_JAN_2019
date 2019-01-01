package actionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.doosan.com/en/");
		WebElement corporate = wd.findElement(By.xpath("html/body/header/div[3]/div/nav/ul/li[3]/a/span[1]"));
		WebElement leadership = wd.findElement(By.xpath("html/body/header/div[3]/div/nav/ul/li[3]/ul/li[1]/a"));
		WebElement executive = wd.findElement(By.xpath("html/body/header/div[3]/div/nav/ul/li[3]/ul/li[1]/ul/li[2]/a"));
		Actions a = new Actions(wd);
		a.moveToElement(corporate).build().perform();
		Thread.sleep(2000);
		a.moveToElement(leadership).build().perform();
		a.moveToElement(executive).build().perform();
		a.click(executive).build().perform();
	}

}