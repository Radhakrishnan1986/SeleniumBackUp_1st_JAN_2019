package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;

public class DataProviderTest {
	public static WebDriver wd = null;
	@Test(dataProvider = "dataset")
	public void loginTest(String Username, String mobilenumber, String pickupplace, String droplace, String cartype) throws IOException {
		//WebDriver wd = new FirefoxDriver();
		if(wd==null) {
			wd = new FirefoxDriver();
		}
		wd.manage().window().maximize();
		wd.get("http://www.ntltaxi.com/");
		
		HomePage.enterUsername(wd, Username);
		HomePage.enterMobilenumber(wd, mobilenumber);
		HomePage.enterPickupplace(wd, pickupplace);
		HomePage.enterDropplace(wd, droplace);
		HomePage.selectCartype(wd, cartype);
	}

	@DataProvider(name = "dataset")
	public static Object[][] getdata() {
		Object[][] data = new Object[3][5];
		// First Data Set
		data[0][0] = "AAAA";
		data[0][1] = "11111111111";
		data[0][2] = "Adaya";
		data[0][3] = "Tambaram";
		data[0][4] = "Sedan";

		// Second Data Set
		data[1][0] = "BBBB";
		data[1][1] = "2222222222";
		data[1][2] = "Adaya";
		data[1][3] = "Tambaram";
		data[1][4] = "Sedan";

		// Third Data Set
		data[2][0] = "CCCC";
		data[2][1] = "3333333333";
		data[2][2] = "Adaya";
		data[2][3] = "Tambaram";
		data[2][4] = "Sedan";
		return data;
	}

}
