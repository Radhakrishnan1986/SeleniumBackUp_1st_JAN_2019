package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFileNTLSite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.ntltaxi.com/");

		File f = new File("C:\\SeleniumWorkspace\\WebdriverTest\\file\\test.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		//System.out.println(prop.get("name"));

		WebElement name1 = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[2]"));
		name1.sendKeys(prop.getProperty("name"));
		WebElement mobilenum1 = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[3]"));
		mobilenum1.sendKeys(prop.getProperty("mobilenum"));
		WebElement pickup1 = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[5]"));
		pickup1.sendKeys(prop.getProperty("pickup"));
		WebElement drop1 = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[6]"));
		drop1.sendKeys(prop.getProperty("drop"));
	}

}
