package frameTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
	WebDriver wd = new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_frame_cols");
	wd.switchTo().frame(0);
	
}
	
}
