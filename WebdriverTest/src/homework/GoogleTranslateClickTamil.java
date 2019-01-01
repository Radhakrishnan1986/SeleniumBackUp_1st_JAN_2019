package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTranslateClickTamil {


	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://translate.google.com/");
		WebElement languagedropdown = wd.findElement(By.xpath(".//div[@id='gt-lang-src']//div[@id='gt-sl-gms']"));
		languagedropdown.click();
		
		Thread.sleep(2000);
		for(int i =1; i<=5; i++) {
			languagedropdown.sendKeys(Keys.ARROW_RIGHT);
			Thread.sleep(2000);
		}
		for(int i =1; i<=12; i++) {
			languagedropdown.sendKeys(Keys.ARROW_DOWN);		
			Thread.sleep(1000);
		}
		languagedropdown.sendKeys(Keys.ENTER);
		
		String Actual = "Tamil";
		WebElement textDisplayed = wd.findElement(By.xpath(".//*[@class='sl-sugg-button-container']//*[contains(text(),'Tamil')]"));
		String Expected = textDisplayed.getText();
		if(Actual.equals(Expected)) {
			System.out.println("Language Tamil has been selected as expected");
		}
		else {
			System.err.println("Language Tamil has not been selected");	
		}

		//WebElement table = wd.findElement(By.xpath(".//div[@id='gt-sl-gms-menu']"));
		//WebElement tamil =wd.findElement(By.xpath(".//tr//td[6]//*[@id='goog-menuitem-group-6']//*[contains(text(),'Tamil')]"));


		
		/*List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i = 0; i < row.size(); i++) {
			List<WebElement> column = row.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < column.size(); j++) {
				String data = column.get(j).getText();

				if(data.contains("Tamil")) {
					column.get(j).click();
				}
			}
			System.out.println();
		}*/

	}

}
