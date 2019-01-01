package genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GnavLinks {

	public static void clickBrandlogo(WebDriver wd) {
		WebElement Brandlogo = wd.findElement(By.xpath("..//*[@class='site-header__section site-header__section--branding']//div[@id='node-60']"));
		Brandlogo.click();
	}
	
	public static void clickSignInlink(WebDriver wd) {
		WebElement signInlink = wd.findElement(By.xpath(".//*[@data-test-id='home_myaccount_button_register']"));
		signInlink.click();
	}
	public static void clickSearchIcon(WebDriver wd) {
		WebElement SearchIcon = wd.findElement(By.xpath(".//*[@class='gnav-util-formatter__item']//a[@title='search']"));
		SearchIcon.click();
	}
	public static void enterInputOnSearchfield(WebDriver wd, String serachterms) {
		WebElement Searchfield = wd.findElement(By.xpath(".//*[@class='gnav-util__content-inner']//input[@id='search']"));
		Searchfield.sendKeys(serachterms);
		
	}
	
	public static void clickCartlink(WebDriver wd) {
		WebElement Cartlink = wd.findElement(By.xpath(".//*[@id='node-74']/div/div/div/div[6]/div/a/i"));
		Cartlink.click();
	}
	
}
