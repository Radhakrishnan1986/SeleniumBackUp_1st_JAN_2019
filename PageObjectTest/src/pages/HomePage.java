package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	public String nameXpath;

	public HomePage() throws IOException {
		File f = new File("C:\\SeleniumWorkspace\\PageObjectTest\\File\\NTLtest.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		nameXpath = prop.getProperty("nameXpath");
	}
	
	public static void enterUsername(WebDriver wd, String Username) throws IOException {
		HomePage hp = new HomePage();
		WebElement name = wd.findElement(By.xpath(hp.nameXpath));
		name.sendKeys(Username);
	}

	public static void enterMobilenumber(WebDriver wd, String mobilenumber) {
		WebElement mobnum = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[3]"));
		mobnum.sendKeys(mobilenumber);
	}

	public static void enterPickupplace(WebDriver wd, String pickupplace) {
		WebElement pick = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[4]"));
		pick.sendKeys(pickupplace);

	}

	public static void enterDropplace(WebDriver wd, String dropplace) {
		WebElement drop = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[7]"));
		drop.sendKeys(dropplace);
	}

	public static void selectCartype(WebDriver wd, String cartype) {
		WebElement ctype = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/select[1]"));
		Select s = new Select(ctype);
		s.selectByVisibleText(cartype);
	}

}
