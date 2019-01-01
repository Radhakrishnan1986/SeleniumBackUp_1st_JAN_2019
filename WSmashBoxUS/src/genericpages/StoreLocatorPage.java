package genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreLocatorPage {

	public static void clickStoreLink(WebDriver wd) throws InterruptedException {
		WebElement storelink = wd.findElement(By.xpath(".//*[@class='menu__item menu__item--lvl-1 stores']//*[contains(text(),'Stores')]"));
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].click();", storelink);
	}

	public static void storelocatorSerachLocation(WebDriver wd, String zipcode) {
		WebElement searchLocaltion = wd.findElement(By.xpath(".//*[@data-test-id='storelocator_currentlocation']"));
		searchLocaltion.sendKeys(zipcode);
		WebElement findestorebutton = wd.findElement(By.xpath(".//*[@data-test-id='storelocator_findstore']"));
		findestorebutton.click();
	}

	public static void verifyStroeslistes(WebDriver wd) {
		WebElement searchresult = wd.findElement(By.xpath(".//*[@class='store_name']//a[contains(text(),'Sephora')]"));
		System.out.println(searchresult.getText());
	}

}
