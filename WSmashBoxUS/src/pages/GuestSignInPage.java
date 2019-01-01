package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestSignInPage {

public static void enterNewUsereEmailAddress(WebDriver wd, String emailaddress1) {
	WebElement emailadd = wd.findElement(By.xpath(".//*[@data-test-id='form_signin_new_user_email']"));
	emailadd.sendKeys(emailaddress1);
}

public static void clickCheckoutAsGuestButton(WebDriver wd) {
	WebElement guestsubmitbutton = wd.findElement(By.xpath(".//*[@data-test-id='form_checkout_signin_new_user_submit']"));
	guestsubmitbutton.click();
}

	
}
