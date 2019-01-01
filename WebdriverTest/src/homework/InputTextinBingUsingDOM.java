package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InputTextinBingUsingDOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.bing.com/");
		//Thread.sleep(4000);
		//WebElement table = wd.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[2]"));
		//System.out.println(table.getText());
		/*List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i = 0; i < row.size(); i++) {
			List<WebElement> colum = row.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < colum.size(); j++) {
				String data = colum.get(j).getText();
				System.out.print("  " + data);
			}
		}*/
		//document.form[1].elements[1]
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("document.form.div[1].inputid[sb_form_q]elements[0].value='abc'");
	}

}