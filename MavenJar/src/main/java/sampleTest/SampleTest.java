package sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://www.google.com/");
		System.out.println(wd.getTitle());
		WebElement input =wd.findElement(By.name("q"));
		input.sendKeys("ABC");
		input.submit();
		Thread.sleep(2000);
		System.out.println(wd.getTitle());
	}

}
