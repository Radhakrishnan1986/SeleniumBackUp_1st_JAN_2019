package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericpages.GnavLinks;
import myAccountpages.AccountLandingPage;
import myAccountpages.AddressBookPage;
import myAccountpages.SignInOverlay;

public class MyAccAddBookValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.smashbox.com/");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		GnavLinks.clickSignInlink(wd);

		SignInOverlay.retunUserenterEmailAddress(wd, "testsbx1410h@yopmail.com");
		SignInOverlay.retunUserenterPassword(wd, "password");
		SignInOverlay.retunUserClickSubmit(wd);
		
		AccountLandingPage.clickAddressBooklink(wd);
		Thread.sleep(8000);
		AddressBookPage.clickAddNewAddressLink(wd);
		Thread.sleep(8000);
		AddressBookPage.enterFirstName(wd, "Test Add Book");
		AddressBookPage.enterLastName(wd, "Test 2");
		AddressBookPage.enterAddress1(wd, "testtd");
		AddressBookPage.enterZipcode(wd, "10001");
		//AddressBookPage.enterCityname(wd, "New York");
		//AddressBookPage.selectState(wd, "New York");
		Thread.sleep(4000);
		AddressBookPage.enterPhonenumber(wd,"8888888888");
		AddressBookPage.selectMakethisAddressCheckbox(wd);
		AddressBookPage.AdPageClickSubmitButton(wd);
		
		Thread.sleep(6000);
		AddressBookPage.clickdeleteAddressLink(wd);
		Thread.sleep(4000);
		AddressBookPage.clickCancelLinkinConfirmationOverlay(wd);
		Thread.sleep(4000);
		AccountLandingPage.clickaccountOverviewlink(wd);
		Thread.sleep(4000);
		AccountLandingPage.clickAddressBooklink(wd);
		Thread.sleep(4000);
		AddressBookPage.clickdeleteAddressLink(wd);
		AddressBookPage.clickDeleteLinkinConfirmationOverlay(wd);
		
		Thread.sleep(6000);
		AccountLandingPage.clickaccountOverviewlink(wd);
		AccountLandingPage.clickSignOutlink(wd);
	}

}
