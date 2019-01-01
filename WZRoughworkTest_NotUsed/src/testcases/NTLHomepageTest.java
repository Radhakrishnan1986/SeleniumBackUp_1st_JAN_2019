package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Homepage;

public class NTLHomepageTest {

	public static void main() {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.ntltaxi.com/");

		Homepage Homepage = PageFactory.initElements(wd, Homepage.class);
	}

	/*
	 * WebDriver wd = null;
	 * 
	 * @Test(dataProvider = "dataset") public void main(String Username, String
	 * mobilenumber, String pickupplace, String dropplace, String cartype) throws
	 * IOException { if (wd == null) { wd = new FirefoxDriver(); }
	 * wd.manage().window().maximize(); wd.get("http://www.ntltaxi.com/");
	 * 
	 * Homepage.enterUsername(wd, Username); Homepage.enterMobilenumber(wd,
	 * mobilenumber); Homepage.enterPickupplace(wd, pickupplace);
	 * Homepage.enterDropplace(wd, dropplace); Homepage.selectCartype(wd, cartype);
	 * 
	 * }
	 * 
	 * @DataProvider(name = "dataset") public static Object[][] dataset() { Object
	 * data[][] = new Object[3][5]; data[0][0] = "AAAA"; data[0][1] = "11111111111";
	 * data[0][2] = "Adaya"; data[0][3] = "Tambaram"; data[0][4] = "Sedan";
	 * 
	 * // Second Data Set data[1][0] = "BBBB"; data[1][1] = "2222222222"; data[1][2]
	 * = "Adaya"; data[1][3] = "Tambaram"; data[1][4] = "Sedan";
	 * 
	 * // Third Data Set data[2][0] = "CCCC"; data[2][1] = "3333333333"; data[2][2]
	 * = "Adaya"; data[2][3] = "Tambaram"; data[2][4] = "Sedan"; return data; }
	 */

}
