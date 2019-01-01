package webelementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("file:///D:/RK/test.html");
		String row = "html/body/form[";
		String endXpath = "]/input[";
		String colum = "]";
		for(int i = 1; i<=3 ; i++) {
			for(int j = 1; j <= 3; j++) {
				String xpath = row+i+endXpath+j+colum;
				WebElement field = wd.findElement(By.xpath(xpath));
				field.sendKeys("abc");
			}
		}

		
	}

}
