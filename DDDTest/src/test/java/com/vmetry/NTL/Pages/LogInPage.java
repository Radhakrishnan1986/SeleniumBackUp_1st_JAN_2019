package com.vmetry.NTL.Pages;

import org.openqa.selenium.WebElement;

import com.vmetry.NTL.Intializer.Initializer;

public class LogInPage extends Initializer {

	public static void enterMobileNumber(String mobilenumber) {
		getWebElementByXpath("LOGINPAGE_TYPE_MOBILENUMBER_XPATH").sendKeys(mobilenumber);
	}
	
	public static void enterpassword(String password) {
		getWebElementByXpath("LOGINPAGE_TYPE_PASSWORD_XPATH").sendKeys(password);
	}
	
	public static void ClickLetsGoButton() {
		getWebElementByXpath("LOGINPAGE_SUBMIT_LETSGO_XPATH").click();
	}
	
}
