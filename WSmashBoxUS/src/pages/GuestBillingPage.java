package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GuestBillingPage {
	public static void enterCCnumber(WebDriver wd, String CCnumber) {
		WebElement CCnumber1 = wd.findElement(By.xpath(
				".//*[@data-test-id='cart_payment_input_card']"));
		CCnumber1.sendKeys(CCnumber);
	}
	
	public static void selectMonth(WebDriver wd, String month) {
		WebElement month1 = wd.findElement(By.xpath("(//*[@class='select-box__label js-select-box-label'])[5]"));
		month1.click();
		WebElement monthDropDown=wd.findElement(By.xpath("//*[@id=\"form--checkout_billing--field--EXPIRES_MONTH\"]/div[2]/div[6]"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].click();", monthDropDown);

	}
	public static void selectyear(WebDriver wd, String year) {
		WebElement year1 = wd.findElement(By.xpath("//*[@data-test-id='form_payment_expyear']//div[@class='select-box__label js-select-box-label']"));
		year1.click();
		WebElement yearDropDown= wd.findElement(By.xpath("(//*[@class='form-item expires-year select']//div[@class='select-box__option js-select-box-option'])[6]"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].click();", yearDropDown);
	}
	
	public static void enterCVVnumber(WebDriver wd, String CVVNumber) {
		WebElement CVVNumber1 = wd.findElement(By.xpath(".//*[@data-test-id='cart_payment_input_cvv']"));
		CVVNumber1.sendKeys(CVVNumber);
	}
	
	public static void clickContinueButton(WebDriver wd) {
		WebElement continueButton = wd.findElement(By.xpath("(.//*[@data-test-id='cart_payment_button_submit'])[2]"));
		continueButton.submit();
	}
	
}
