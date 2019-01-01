package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericpages.GnavLinks;
import genericpages.Minicart;
import genericpages.SPPage;
import genericpages.SamplesPage;
import genericpages.Shoppingcart;
import myAccountpages.AccountLandingPage;
import pages.GuestBillingPage;
import pages.GuestOrderConfirmationPage;
import pages.GuestOrderReviewPage;
import pages.GuestShippingPage;
import pages.GuestSignInPage;

public class GuestUserCheckout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.smashbox.com/");
		
		//Guest Checkout
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SPPage.addProduct(wd);
		Thread.sleep(2000);
		GnavLinks.clickCartlink(wd);
		Minicart.clickCheckoutbutton(wd);
		
		Thread.sleep(2000);
		//Shoppingcart.increaseProductQuantity(wd);
		Shoppingcart.cartCheckoutButton(wd);
		SamplesPage.clickNoThankslink(wd);
		GuestSignInPage.enterNewUsereEmailAddress(wd, "testsbx14102b@yopmail.com");
		GuestSignInPage.clickCheckoutAsGuestButton(wd);
		GuestShippingPage.enterFirstName(wd, "Test 1");
		GuestShippingPage.enterLastName(wd, "Test 2");
		GuestShippingPage.enterAddress1(wd, "testtd");
		GuestShippingPage.enterZipcode(wd, "10001");

		//GuestShippingPage.enterCityname(wd, "New York");
		//GuestShippingPage.selectState(wd, "New York");

		GuestShippingPage.enterPhonenumber(wd, "9999999999");
		Thread.sleep(10000);
		GuestShippingPage.SpageClickContinueButton(wd);
		
		GuestBillingPage.enterCCnumber(wd, "4111111111111111");
		GuestBillingPage.selectMonth(wd, "11");
		GuestBillingPage.selectyear(wd, "2020");
		GuestBillingPage.enterCVVnumber(wd, "100");
		GuestBillingPage.clickContinueButton(wd);
		
		GuestOrderReviewPage.clickPlaceOrderButton(wd);
		
		GuestOrderConfirmationPage.enterPassword(wd, "123@Tester");
		GuestOrderConfirmationPage.selectMonth(wd, "8");
		GuestOrderConfirmationPage.selectDate(wd, "15");
		GuestOrderConfirmationPage.clickJoinButton(wd);
		
		AccountLandingPage.clickSignOutlink(wd);
	}

}
