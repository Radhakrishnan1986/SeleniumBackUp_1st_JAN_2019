package myAccountpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLandingPage {

	public static void clickCloseicon(WebDriver wd) {
		WebElement closeIcon = wd.findElement(By.xpath(".//div[@class='gnav-util__content js-gnav-util__content gnav-util__content--account']//i[@class='icon icon--close']"));
		closeIcon.click();
	}
	
	public static void clickSignOutlink(WebDriver wd) {
		WebElement signoutlink = wd.findElement(By.xpath(".//*[@data-test-id='myaccount_menu_signout']"));
		signoutlink.click();
	}

	public static void clickaccountOverviewlink(WebDriver wd) {
		WebElement accountoverview = wd.findElement(By.xpath(".//*[@data-test-id='myaccount_menu_account']"));
		accountoverview.click();
	}
	public static void clickAddressBooklink(WebDriver wd) {
		WebElement accountaddressbooklink = wd.findElement(By.xpath(".//*[@data-test-id='myaccount_menu_shipping_billing']"));
		accountaddressbooklink.click();
	}
}
