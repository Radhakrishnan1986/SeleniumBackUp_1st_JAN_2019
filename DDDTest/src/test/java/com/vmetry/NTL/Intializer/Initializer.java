package com.vmetry.NTL.Intializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vmetry.Reportgenerator.Reportgenerator;

public class Initializer {
	/**
	 * Initializing the reports variable
	 */
	public static ExtentReports reports;
	public static ExtentTest log;
	/**
	 * Declaring environment variables
	 */
	public static FileInputStream envfis = null;
	public static Properties envprop = null;
	/**
	 * Declaring the locator properties
	 */
	public static FileInputStream locatorfis = null;
	public static Properties locatorprop = null;
	
	/**
	 * Initializing the property file, Webdriver, etc
	 * @throws IOException
	 */
	public static WebDriver wd = null;
	public static boolean isreport = true;
	
	public static void intialize() throws IOException {
	if(isreport) {
		reports=new ExtentReports("C:\\SeleniumWorkspace\\DDDTest\\Report\\report.html");
		Reportgenerator.archivefile();
		isreport = false;
	}
	
	envfis = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vmetry"+File.separator+"NTL"+File.separator+"config"+File.separator+"env.properties"));
	envprop = new Properties();
	envprop.load(envfis);

	locatorfis = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vmetry"+File.separator+"NTL"+File.separator+"config"+File.separator+"locator.properties"));
	locatorprop = new Properties();
	locatorprop.load(locatorfis);
	
	
	if(envprop.getProperty("BROWSER").equals("FIREFOX")) {
		if(wd==null) {
		wd = new FirefoxDriver();
		}
	}
	if(envprop.getProperty("BROWSER").equals("CHROME")) {
			if(wd==null) {
				System.setProperty("webdriver.chrome.driver","C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
				wd = new ChromeDriver();
			}
	}
	}
	public static WebElement getWebElementByXpath(String xpath) {
		return wd.findElement(By.xpath(locatorprop.getProperty(xpath)));
		
	}
}
