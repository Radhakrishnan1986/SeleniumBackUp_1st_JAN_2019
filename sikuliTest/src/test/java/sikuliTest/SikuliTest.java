package sikuliTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliTest {

	public static void main(String[] args) throws FindFailed {
		//Image locator in patern format
		Pattern gmail=  new Pattern("C:\\SeleniumWorkspace\\sikuliTest\\Locator\\gmail.PNG");
				
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		Screen s = new Screen();
		s.wait(gmail, 10);
		s.click(gmail);
		//s.
	}

}
