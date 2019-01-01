package webelementTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableHandlingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = wd.findElement(By.xpath("html/body/div[6]/div[1]/div[1]/div[3]/div/table"));
		// System.out.println(table.getText());
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i = 0; i < row.size(); i++) {
			List<WebElement> colum = row.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < colum.size(); j++) {
				String data = colum.get(j).getText();
				System.out.print("  " + data);
			}
			System.out.println();
		}

	}

}
