package dec18Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListenerTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		EventFiringWebDriver efwd = new EventFiringWebDriver(wd);
		MylistenerTest m = new MylistenerTest();
		efwd.register(m);

		efwd.manage().window().maximize();
		efwd.get("https://www.google.com/");
		WebElement input = efwd.findElement(By.name("q"));
		input.sendKeys("ABC");
		input.submit();
		
		efwd.navigate().back();
		efwd.navigate().forward();
		efwd.navigate().refresh();

	}

}
