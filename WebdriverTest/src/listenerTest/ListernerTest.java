package listenerTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListernerTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		EventFiringWebDriver efwd = new EventFiringWebDriver(wd);
		MyListenerTest m = new MyListenerTest();
		efwd.register(m);
		efwd.manage().window().maximize();
		efwd.get("https://www.bing.com/");
		WebElement input = efwd.findElement(By.name("q"));
		input.sendKeys("abc");
		input.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		efwd.navigate().back();
		Thread.sleep(2000);
		efwd.navigate().forward();
		Thread.sleep(2000);
		efwd.navigate().refresh();
		
//FYI Listener URL: https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/support/events/AbstractWebDriverEventListener.html		
	}

}
