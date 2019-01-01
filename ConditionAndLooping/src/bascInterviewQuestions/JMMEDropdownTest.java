package bascInterviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JMMEDropdownTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://wwwtmp.jomalone-me.com/");
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.navigate().to("https://wwwtmp.jomalone-me.com/ae/en/account/address_book/index.tmpl#");

		// Thread.sleep(30000);
		WebElement city = wd.findElement(By.name("CITY"));
		Select s = new Select(city);
		List<WebElement> allcitys = s.getOptions();

		for (int i = 1; i < allcitys.size(); i++) {
			allcitys.get(i).click();
			System.err.println(allcitys.get(i).getText());

			Thread.sleep(20000);
			// WebDriverWait wait =new WebDriverWait(wd, 30);
			// wait.until(ExpectedConditions.presenceOfElementLocated(By.name("STATE")));
			WebElement area = wd.findElement(By.name("STATE"));
			Select s1 = new Select(area);
			List<WebElement> allareas = s1.getOptions();

			for (int j = 1; j < allareas.size(); j++) {
				System.out.println(allareas.get(j).getText());
			}
		}

		/*WebElement firstselect = s.getFirstSelectedOption();
		String output = firstselect.getText();
		System.out.println(output);*/

	}

}
