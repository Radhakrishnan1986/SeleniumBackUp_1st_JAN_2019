package genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

	public static void enterInputOnSearchfield(WebDriver wd, String serachterms) {
		WebElement Searchfield = wd.findElement(By.xpath(".//*[@class='gnav-util__content-inner']//input[@id='search']"));
		Searchfield.sendKeys(serachterms);	
	}
	
	public static void clickSubmitbutton(WebDriver wd) {
		WebElement Submitbutton = wd.findElement(By.xpath(".//*[@class='gnav-util__content-inner']//input[@class='esearch-nav__form-submit search-form__submit button']"));
		Submitbutton.submit();
	}
	
	public static void serachPageAddProducts(WebDriver wd) {
		WebElement BeLegendaryLipPalette = wd.findElement(By.xpath(".//*[@class='product-brief__content']//*[contains(text(),'Be Legendary Lip Palette: Ablaze')]"));
		if(BeLegendaryLipPalette.isDisplayed()) {
			WebElement quickshop = wd.findElement(By.xpath(".//*[@class='product-brief__content']//*[@data-product-id='PROD58749']"));
			JavascriptExecutor js = (JavascriptExecutor)wd;
			js.executeScript("arguments[0].click();", quickshop);
			WebElement AddToBag = wd.findElement(By.xpath(".//*[@data-test-id='add-to-cart']"));
			AddToBag.click();
			WebElement QuickshopClosebutton=wd.findElement(By.xpath(".//*[@id='cboxClose']"));
			QuickshopClosebutton.click();
		}

	}
	
}
