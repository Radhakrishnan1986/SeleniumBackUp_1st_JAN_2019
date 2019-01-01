package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestOrderReviewPage {
	
	public static void clickPlaceOrderButton(WebDriver wd) {
		WebElement placeOrderbutton = wd.findElement(By.xpath(".//*[@data-test-id='form_checkout_confirm']"));
		placeOrderbutton.submit();
	}
}
