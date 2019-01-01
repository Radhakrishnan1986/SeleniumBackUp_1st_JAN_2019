package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pages.HomePage;

public class HomePageTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.ntltaxi.com/");

		HomePage homepage = PageFactory.initElements(wd, HomePage.class);
		homepage.enterUsername("Radhakrishnan");
		homepage.enterMobilenumber("9999999999");
		homepage.enterPickupplace("Adayar");
		homepage.enterDropplace("Tambaram");
		homepage.selectCartype("Sedan");
	}

}
