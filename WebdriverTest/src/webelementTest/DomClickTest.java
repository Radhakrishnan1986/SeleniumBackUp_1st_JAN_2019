package webelementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DomClickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		/*wd.get("https://www.google.com/");
		WebElement gmail = wd.findElement(By.linkText("Gmail"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].click()", gmail);*/
		
		wd.get("https://www.bing.com/");
		WebElement bing = wd.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/input[1]"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].value='abc'", bing);
		

	}

}
