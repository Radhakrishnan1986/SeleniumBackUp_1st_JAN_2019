package xPathTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathTest2 {

	public static void main(String[] args) {
		Map<String, String> me = new HashMap<String, String>();
		me.put("deviceName", "iPhone X");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars");
		option.setExperimentalOption("mobileEmulation", me);
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver(option);
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		List<WebElement> input = wd.findElements(By.cssSelector("ul.sc_hl1.hp_head_nav>li"));
		input.get(0).findElements(By.tagName("a"));

		
	}

}
