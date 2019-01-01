package genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Minicart {

	public static void clickCheckoutbutton(WebDriver wd) {
		WebElement Checkoutbutton = wd.findElement(By.xpath(".//*[@data-test-id='gnav_bag_checkout']"));
		Checkoutbutton.click();
	}
	
}