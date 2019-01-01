package genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shoppingcart {
	public static void increaseProductQuantity(WebDriver wd) {
		WebElement quantityDropDownClick = wd.findElement(By.xpath("(.//*[@class='select-box__label js-select-box-label'])[5]"));
		quantityDropDownClick.click();
		WebElement selectQuantity=wd.findElement(By.xpath("(//*[@class='qty cart-items__item--qty']//div[@class='select-box__option js-select-box-option'])[4]"));
		selectQuantity.click();
	}

	public static void cartCheckoutButton(WebDriver wd) {
		WebElement cartcbutton = wd.findElement(By.xpath(".//*[@data-test-id='cart_primarycheckout']"));
		// cartcbutton.click();
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].click();", cartcbutton);
	}
}