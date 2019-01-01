package autoITTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://tinyupload.com/");
		WebElement upload = wd.findElement(By.xpath("html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]"));
		upload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\SeleniumWorkspace\\AutoITTest\\lib\\upload5.exe");
		
		
	}

}
