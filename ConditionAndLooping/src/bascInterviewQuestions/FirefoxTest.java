package bascInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxTest {

public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumWorkspace\\RoughworkTest\\Browser\\geckodriver.exe");
	//DesiredCapabilities cap = DesiredCapabilities.firefox();
	//cap.setCapability("marionette", true);
	WebDriver wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.google.com/");
	WebElement input = 	wd.findElement(By.name("q"));
	input.sendKeys("ABC");
	input.sendKeys(Keys.ENTER);
}

}