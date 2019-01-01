package com.vmetry.NTL.Testcaes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vmetry.InputReader.inputReader;
import com.vmetry.NTL.Intializer.Initializer;
import com.vmetry.NTL.Pages.HomePage;
import com.vmetry.Reportgenerator.Reportgenerator;

public class HomePageTest extends Initializer {

	@Test(dataProvider = "dataset")
	public void openbrowser(String Testdata, String Username, String Mobilenumber, String PickupAddress,String DropAddress, String Cartype) throws IOException {
		intialize();
		log = reports.startTest(Testdata);// To start the log in every test case
		wd.get(envprop.getProperty("URL"));
		/*
		 * WebElement name =
		 * wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[2]"));
		 * name.sendKeys("Test"); WebElement mobilenum =
		 * wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[3]"));
		 * mobilenum.sendKeys("9999999999"); WebElement pickup =
		 * wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[4]"));
		 * pickup.sendKeys("Tambaram"); WebElement drop =
		 * wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[7]"));
		 * drop.sendKeys("Adayar"); WebElement ctype=
		 * wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/select[1]"));
		 * Select s = new Select(ctype); s.selectByVisibleText("Sedan");
		 */

		/*
		 * WebElement name = wd.findElement(By.xpath(locatorprop.getProperty(
		 * "HOMEPAGE_TYPE_USERNMAE_XPATH"))); name.sendKeys("Test"); WebElement
		 * mobilenum = wd.findElement(By.xpath(locatorprop.getProperty(
		 * "HOMEPAGE_TYPE_MOBILENUMBER_XPATH"))); mobilenum.sendKeys("9999999999");
		 * WebElement pickup = wd.findElement(By.xpath(locatorprop.getProperty(
		 * "HOMEPAGE_TYPE_PICKUPPLACE_XPATH"))); pickup.sendKeys("Tambaram"); WebElement
		 * drop = wd.findElement(By.xpath(locatorprop.getProperty(
		 * "HOMEPAGE_TYPE_DROPPLACE_XPATH"))); drop.sendKeys("Adayar"); WebElement
		 * ctype= wd.findElement(By.xpath(locatorprop.getProperty(
		 * "HOMEPAGE_SELECT_CARTYPE_XPATH"))); Select s = new Select(ctype);
		 * s.selectByVisibleText("Sedan");
		 */

		/*
		 * getWebElementByXpath("HOMEPAGE_TYPE_USERNMAE_XPATH").sendKeys("Test");
		 * getWebElementByXpath("HOMEPAGE_TYPE_MOBILENUMBER_XPATH").sendKeys(
		 * "9999999999");
		 * getWebElementByXpath("HOMEPAGE_TYPE_PICKUPPLACE_XPATH").sendKeys("Tambaram");
		 * getWebElementByXpath("HOMEPAGE_TYPE_DROPPLACE_XPATH").sendKeys("Adayar");
		 * getWebElementByXpath("HOMEPAGE_SELECT_CARTYPE_XPATH").sendKeys("Sedan");
		 */

		HomePage.enterUserName(Username);
		HomePage.enterMobileNumber(Mobilenumber);
		HomePage.enterPickupplace(PickupAddress);
		HomePage.enterDropPlace(DropAddress);
		HomePage.selectCarType(Cartype);
	}

	@DataProvider(name = "dataset")
	public static Object[][] getdata() throws Exception {

		if (inputReader.runModeVerification("HomePageTest")) {

			Object[][] data = inputReader.selectSingleDataOrMulitiData("HomePageTest");
			
			/*Object[][] data = new Object[3][5]; 
			 //First Data Set 
			 data[0][0] ="Test 1";
			 data[0][1] = "22222222222"; 
			 data[0][2] = "Tamabaram"; 
			 data[0][3] = "Adayar";
			 data[0][4] = "Sedan";

			 //Second Data Set 
			 data[1][0] = "Test 2";
			 data[1][1] = "33333333333";
			 data[1][2] = "Tamabaram";
			 data[1][3] = "Adayar"; data[1][4] = "Sedan";
	
			 * //Third Data Set 
			 data[2][0] = "Test 3"; 
			 data[2][1] = "44444444444";
			 data[2][2] = "Tamabaram"; 
			 data[2][3] = "Adayar"; 
			 data[2][4] = "Sedan"; */
			return data;
		}
		return null;
	}

	@AfterMethod
	public void teardown(ITestResult it) throws IOException {
		Reportgenerator.generatereport(it);

	}
}