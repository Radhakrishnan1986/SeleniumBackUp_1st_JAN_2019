package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericpages.StoreLocatorPage;

public class StoreLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.smashbox.com/");
		
		StoreLocatorPage.clickStoreLink(wd);
		StoreLocatorPage.storelocatorSerachLocation(wd, "10001");
		Thread.sleep(6000);
		StoreLocatorPage.verifyStroeslistes(wd);
		
	}

}
