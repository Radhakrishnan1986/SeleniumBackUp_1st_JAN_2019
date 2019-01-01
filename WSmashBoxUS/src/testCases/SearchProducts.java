package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericpages.GnavLinks;
import genericpages.SearchPage;

public class SearchProducts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.smashbox.com/");
		
		GnavLinks.clickSearchIcon(wd);
		SearchPage.enterInputOnSearchfield(wd, "Lips");
		SearchPage.clickSubmitbutton(wd);
		
		Thread.sleep(8000);
		SearchPage.serachPageAddProducts(wd);
	}
	
}
