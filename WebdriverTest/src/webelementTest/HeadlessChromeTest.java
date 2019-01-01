package webelementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars");
		option.addArguments("--headless");
		option.addArguments("--disable-gpu");
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver(option);
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		System.out.println(wd.getTitle());
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("ABC");
		input.sendKeys(Keys.ENTER);
		System.out.println(wd.getTitle());

	}

}
