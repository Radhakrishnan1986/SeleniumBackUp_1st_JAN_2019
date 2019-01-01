package myAccountpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddressBookPage {

	public static void clickAddNewAddressLink(WebDriver wd) {
		WebElement AddNewAddressLink = wd.findElement(By.xpath(".//*[@data-test-id='account_addressbook_addnewaddress']"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].click();", AddNewAddressLink);
	}
	
	public static void clickdeleteAddressLink(WebDriver wd) {
		WebElement clickdeleteAddressLink = wd.findElement(By.xpath(".//*[@data-test-id='address_primary_delete']"));
		clickdeleteAddressLink.click();
	}
	
	/*
	 * links in Delete Address Overlay
	 */
	public static void clickCancelLinkinConfirmationOverlay(WebDriver wd) {
		WebElement clickCancellink = wd.findElement(By.xpath(".//*[@data-test-id='addressbook_delete_popup_cancel']"));
		clickCancellink.click();
	}
	public static void clickDeleteLinkinConfirmationOverlay(WebDriver wd) {
		WebElement clickConfirmlink = wd.findElement(By.xpath(".//*[@data-test-id='addressbook_delete_popup_delete']"));
		clickConfirmlink.click();
	}
	
	/*
	 * Fields in Add new address Popup
	 */
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

	public static void selectMakethisAddressCheckbox(WebDriver wd) {
		WebElement makethisAddressCheckbox = wd.findElement(By.xpath(".//label[@for='form--address_shipping--field--DEFAULT_SHIPPING']/span[@class='label-content']"));
		if(!makethisAddressCheckbox.isSelected()) {
			makethisAddressCheckbox.click();
		}
	}
	public static void AdPageClickSubmitButton(WebDriver wd) {
		WebElement adcontinueButton = wd.findElement(By.xpath(".//*[@data-test-id='form_address_submit']"));
		adcontinueButton.click();
		}

}
