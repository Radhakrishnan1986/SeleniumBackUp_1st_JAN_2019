package homework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlinkingofScreenBorderTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement logo = wd.findElement(By.id("hplogo"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		for(int i =0; i<50;i++) {
		js.executeScript("arguments[0].style.border='5px solid red'", logo);
		//Thread.sleep(500);
		js.executeScript("arguments[0].style.border='5px solid white'", logo);
		}
	}

}
