package webelementTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTesrt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		wd.switchTo().frame(0);
		WebElement tryit = wd.findElement(By.xpath("html/body/button"));
		tryit.click();
		Thread.sleep(2000);
		Alert a = wd.switchTo().alert();
		String data = a.getText();
		System.out.println(data);
		a.accept();// To click ok in alert box
		//a.dismiss();// To click cancel in alert box if it is available in alert box
	}

}
