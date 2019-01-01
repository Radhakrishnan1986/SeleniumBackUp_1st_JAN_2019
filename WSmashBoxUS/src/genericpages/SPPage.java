package genericpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SPPage {

	public static void addProduct(WebDriver wd) {
		WebElement products = wd.findElement(By.xpath(".//*[@id='node-104']/div/div/div[2]/div[3]/span"));
		Actions a = new Actions(wd);
		a.moveToElement(products).build().perform();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement brushes = wd.findElement(By.xpath(".//*[@id='node-106']/div/section/div[3]/div[5]/div[1]/div[2]/article/div/div/div/ul/li[1]/a"));
		a.moveToElement(brushes).build().perform();
		a.click(brushes).build().perform();
		
		//Direct SPP link
		//wd.get("https://www.smashbox.com/products/17650/accessories/brushes");
		
		WebElement quickshop = wd.findElement(By.xpath(".//*[@data-test-id='mpp_quickshop']"));
		a.click(quickshop).build().perform();
		WebElement AddToBag = wd.findElement(By.xpath(".//*[@data-test-id='add-to-cart']"));
		AddToBag.click();
		WebElement QuickshopClosebutton=wd.findElement(By.xpath(".//*[@id='cboxClose']"));
		QuickshopClosebutton.click();
	}
	
}
