package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestOrderConfirmationPage {

	public static void enterPassword(WebDriver wd, String password) {
		WebElement password1 = wd.findElement(By.xpath(".//*[@data-test-id='form_completed_checkout_registration_password']"));
		password1.sendKeys(password);
	}
	
	public static void selectMonth(WebDriver wd, String month) {
		WebElement month1 = wd.findElement(By.xpath("(.//*[@class='select-box__label js-select-box-label'])[5]"));
		month1.click();
		String monthFisrtxpath = "(//*[@class='form_element birth_month_container']//div[@class='select-box__option js-select-box-option'])[";
		String monthSecondxpath = "]";
		String month1dropdownXpath = monthFisrtxpath+month+monthSecondxpath;
		WebElement month1dropdown= wd.findElement(By.xpath(month1dropdownXpath));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].click();", month1dropdown);
	}
	
	public static void selectDate(WebDriver wd, String date) {
		WebElement date1 = wd.findElement(By.xpath("(.//*[@class='form_element birth_day_container'])[1]"));
		date1.click();
		String dateFisrtxpath = "(//*[@class='form_element birth_day_container']//div[@class='select-box__option js-select-box-option'])[";
		String dateSecondxpath = "]";
		String date1dropdownXpath = dateFisrtxpath+date+dateSecondxpath;
		WebElement date1dropdown= wd.findElement(By.xpath(date1dropdownXpath));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].click();", date1dropdown);

	}
	
	public static void clickJoinButton(WebDriver wd) {
		WebElement joinbutton = wd.findElement(By.xpath(".//*[@data-test-id='form_completed_checkout_registration_submit']"));
		joinbutton.click();
	}
	
	public static void clickContunueasGuestLink(WebDriver wd) {
		WebElement contunueasGuestLink = wd.findElement(By.xpath(".//*[@id='completed_checkout_registration']/fieldset/div[1]/a"));
		contunueasGuestLink.click();
	}
	
}
