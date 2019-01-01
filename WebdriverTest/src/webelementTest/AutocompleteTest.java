package webelementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutocompleteTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/autocomplete/");
		wd.switchTo().frame(0);
		WebElement input = wd.findElement(By.xpath("html/body/div[1]/input"));
		input.sendKeys("a");
		Thread.sleep(20000);
		String startXpath = "html/body/ul/li[";
		String endXPath = "]/div";
		int i = 1;
		while (true) {
			try {
			String xpath = startXpath + i + endXPath;
			i++;
			WebElement element = wd.findElement(By.xpath(xpath));
			String data = element.getText();
			System.out.println(data);
			}
			catch (Exception e) {
				break;
			}
		}
	}

}