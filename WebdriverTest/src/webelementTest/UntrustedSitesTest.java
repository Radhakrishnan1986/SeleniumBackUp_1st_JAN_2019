package webelementTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class UntrustedSitesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		
		WebDriver wd = new FirefoxDriver(profile);
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
	}

}
