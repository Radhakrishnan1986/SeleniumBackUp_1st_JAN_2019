package com.vmetry.NTL.Testcaes;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vmetry.InputReader.inputReader;
import com.vmetry.NTL.Intializer.Initializer;
import com.vmetry.NTL.Pages.HomePage;
import com.vmetry.NTL.Pages.LogInPage;

public class LogInPageTest extends Initializer {

	@Test(dataProvider="dataset")
	public void loginTest(String Testdata,String MobileNumber, String Password) throws IOException {
		intialize();
		//log= reports.startTest("");
		wd.get(envprop.getProperty("URL"));
		
		HomePage.clickGNavLogInLink();
		LogInPage.enterMobileNumber(MobileNumber);
		LogInPage.enterpassword(Password);
		LogInPage.ClickLetsGoButton();
	}
	
	@DataProvider(name="dataset")
	public static Object[][] getdata() throws Exception {
		
		if(inputReader.runModeVerification("LoginTest")) {
			Object[][] data = inputReader.selectSingleDataOrMulitiData("LoginTest");	
			return data;
		}
		return null;
		
		/*Object a[][] = new Object[2][2];
		a[0][0] ="9999999999";
		a[0][1] ="Test1";
		
		a[1][0] ="9000000009";
		a[1][1] ="Test2";
		return a;*/
	}

}
