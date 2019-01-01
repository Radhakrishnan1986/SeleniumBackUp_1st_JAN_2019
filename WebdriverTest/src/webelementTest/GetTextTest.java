package webelementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://en.wikipedia.org/wiki/Mukesh_Ambani");
		WebElement line = wd.findElement(By.xpath("html/body/div[3]/div[3]/div[4]/div/p[6]"));
		String data = line.getText();
		System.out.println(data);
		//data.split;

	}

}
