package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericpages.GnavLinks;
import myAccountpages.AccountLandingPage;
import myAccountpages.SignInOverlay;

public class AccountRegistrationTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.smashbox.com/");

		//Account Creation
		GnavLinks.clickSignInlink(wd);
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		SignInOverlay.clickIDonthaveAccLink(wd);
		SignInOverlay.enterFirstName(wd, "Test 1");
		SignInOverlay.enterLastName(wd, "Test 2");
		SignInOverlay.enteremailAddress(wd, "testsbx1410i@yopmail.com");
		SignInOverlay.enterPassword(wd, "password");
		SignInOverlay.selectTCCheckbox(wd);
		SignInOverlay.clickRegistertButton(wd);

		AccountLandingPage.clickCloseicon(wd);
		AccountLandingPage.clickSignOutlink(wd);
	}

}
