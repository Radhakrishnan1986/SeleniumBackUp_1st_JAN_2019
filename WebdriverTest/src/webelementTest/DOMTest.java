package webelementTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DOMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("file:///D:/RK/test.html");
		//document.form[1].elements[1]
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("document.forms[1].elements[1].value='abc'");
	}

}
