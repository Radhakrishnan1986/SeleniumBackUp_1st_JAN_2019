package webdriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebdriverTest {
	@Parameters({ "url", "mobilenumber", "password" })
	@Test
	public void logintest(String url, String mobilenumber, String password) {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get(url);
		WebElement login = wd.findElement(By.linkText("Login"));
		login.sendKeys(Keys.ENTER);
		WebElement phonenumber = wd.findElement(By.xpath("html/body/div[2]/div[1]/form/input[2]"));
		phonenumber.sendKeys(mobilenumber);
		WebElement passwor = wd.findElement(By.xpath("html/body/div[2]/div[1]/form/input[3]"));
		passwor.sendKeys(password);
		WebElement submit = wd.findElement(By.xpath("html/body/div[2]/div[1]/form/input[4]"));
		submit.click();
	}
}