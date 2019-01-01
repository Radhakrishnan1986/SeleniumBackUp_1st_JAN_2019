package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import pages.HomePage;

public class HomePageTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.ntltaxi.com/");
		
		/*WebElement name = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[2]"));
		name.sendKeys("radhakrishnan");
		WebElement mobnum = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[3]"));
		mobnum.sendKeys("999999999");
		WebElement pick = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[4]"));
		pick.sendKeys("Adayar");
		WebElement drop = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[7]"));
		drop.sendKeys("Tambaram");
		WebElement ctype= wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/select[1]"));
		Select s = new Select(ctype);
		s.selectByVisibleText("Sedan");*/
		//WebElement book = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[10]"));
		//book.click();
		
		HomePage.enterUsername(wd, "Radhakrishnan");
		HomePage.enterMobilenumber(wd, "999999999");
		HomePage.enterPickupplace(wd, "Adayar");
		HomePage.enterDropplace(wd, "Tambaram");
		HomePage.selectCartype(wd, "Sedan");

	}

}
