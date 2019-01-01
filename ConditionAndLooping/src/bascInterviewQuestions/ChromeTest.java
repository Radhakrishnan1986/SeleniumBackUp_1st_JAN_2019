package bascInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("file:///D:/RK/WebelementsfromVinoth/textarea.html");
		//wd.findElement(By.xpath(""));
		
	}

}
