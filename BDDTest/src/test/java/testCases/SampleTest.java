package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;

public class SampleTest {
	public static WebDriver wd = null;
	
	@Given("^Open Browser as (.*)$")
	public void openBrowser(String Browser) {
		if (Browser.equals("FIREFOX")) {
			if(wd==null) {
			wd = new FirefoxDriver(); }  } 
		else if (Browser.equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
			if(wd==null) {
			wd = new ChromeDriver(); } }
	}
	
	@Then ("^Enter URL as (.*)$")
	public void enterUrl(String URL) {
		wd.get(URL);
	}
	@Then ("^Enter User name as (.*)$")
	public void enterUSerName(String Username) {
		HomePage.enterusername(wd, Username);
		//WebElement username = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[2]"));
		//username.sendKeys(Username);
		
	}
	@And ("^Enter phone number as (.*)$")
	public void enterPhoneNumber(String Mobilenumber) {
		HomePage.enterMobilenumber(wd, Mobilenumber);
		//WebElement Mobnumber = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[3]"));
		//Mobnumber.sendKeys(Mobilenumber);
	}
	@When ("^Select pickup address as (.*)$")
	public void selectPickUpAddress(String Pickupaddress) {
		HomePage.enterPickupplace(wd, Pickupaddress);
		//WebElement pickupadd = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[4]"));
		//pickupadd.sendKeys(Pickupaddress);

	}
	@Then ("^Select drop adress as (.*)$")
	public void selectDropAddress(String Dropaddress) {
		HomePage.enterDropplace(wd, Dropaddress);
		//WebElement dropadd = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[7]"));
		//dropadd.sendKeys(Dropaddress);
	}
	@And ("^Select vehicle type as (.*)$")
	public void selectVehicleType(String vehicletype) {
		HomePage.selectCartype(wd, vehicletype);
		//WebElement vtype = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/select[1]"));
		//Select s = new Select(vtype);
		//s.selectByVisibleText(vehicletype);
	}
	@But ("^Dont select book button$")
	public void dontSelectbookButton() {
		//System.out.println("Dont select bookbutton");
	}
	@After
	public void teardown(Scenario s) throws IOException {
		if(s.isFailed()) {
			File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			InputStream stream = new FileInputStream(src);
			s.embed(IOUtils.toByteArray(stream), "image/jpeg");
		}

	}
		
}
