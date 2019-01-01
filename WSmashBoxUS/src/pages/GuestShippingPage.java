package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GuestShippingPage {

	public static void enterFirstName(WebDriver wd, String firstname) {
		WebElement usernamefield = wd.findElement(By.xpath(".//*[@data-test-id='form_address_firstname']"));
		usernamefield.sendKeys(firstname);
	}
	
	public static void enterLastName(WebDriver wd, String lastname) {
		WebElement usernamefield = wd.findElement(By.xpath(".//*[@data-test-id='form_address_lastname']"));
		usernamefield.sendKeys(lastname);
	}
	
	public static void enterAddress1(WebDriver wd, String address1) {
		WebElement useraddress1 = wd.findElement(By.xpath(".//*[@data-test-id='form_address_address1']"));
		useraddress1.sendKeys(address1);
	}
	public static void enterZipcode(WebDriver wd, String zipcode) {
		WebElement zipcode1 = wd.findElement(By.xpath(".//*[@data-test-id='form_address_zipcode']"));
		zipcode1.sendKeys(zipcode);
	}

	public static void enterCityname(WebDriver wd, String city) {
		WebElement city1 = wd.findElement(By.xpath(".//*[@data-test-id='form_address_city']"));
		city1.clear();
		city1.sendKeys(city);
	}

	public static void selectState(WebDriver wd, String State) {
		WebElement state1 = wd.findElement(By.xpath("(.//*[@data-test-id='form_address_state'])[2]"));
		Select s = new Select(state1);
		s.selectByVisibleText(State);
	}
	
	public static void enterPhonenumber(WebDriver wd, String phonenumber) {
		WebElement phonenumber1 = wd.findElement(By.xpath(".//*[@data-test-id='form_address_phone']"));
		phonenumber1.sendKeys(phonenumber);
	}
	
	public static void SpageClickContinueButton(WebDriver wd) {
		WebElement continueButton = wd.findElement(By.xpath(".//*[@data-test-id='form_checkout_shipping_panel_continue']"));
		continueButton.click();
	}

}
