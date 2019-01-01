package com.vmetry.NTL.Pages;

import org.openqa.selenium.WebDriver;

import com.vmetry.NTL.Intializer.Initializer;

public class HomePage extends Initializer{

	public static void enterUserName(String UserName) {
		getWebElementByXpath("HOMEPAGE_TYPE_USERNMAE_XPATH").sendKeys(UserName);
	}
	
	public static void enterMobileNumber(String Mobilenumber) {
		getWebElementByXpath("HOMEPAGE_TYPE_MOBILENUMBER_XPATH").sendKeys(Mobilenumber);
	}
	
	public static void enterPickupplace(String PickupPlace ) {
		getWebElementByXpath("HOMEPAGE_TYPE_PICKUPPLACE_XPATH").sendKeys(PickupPlace);		
	}
	
	public static void enterDropPlace(String DropPlace) {
		getWebElementByXpath("HOMEPAGE_TYPE_DROPPLACE_XPATH").sendKeys(DropPlace);		
	}
	
	public static void selectCarType(String Cartype) {
		getWebElementByXpath("HOMEPAGE_SELECT_CARTYPE_XPATH").sendKeys(Cartype);			
	}
	
	public static void clickGNavLogInLink() {
		getWebElementByXpath("HOMEPSGE_CLICK_GNAVLOGIN_XPATH").click();			
	}
	
}
