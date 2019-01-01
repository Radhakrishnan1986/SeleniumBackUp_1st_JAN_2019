package myAccountpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInOverlay {


	public static void clickIDonthaveAccLink(WebDriver wd) {
		WebElement iIDonthaveAccLink = wd.findElement(By.xpath(".//*[@data-test-id='registration_link']"));
		iIDonthaveAccLink.click();
	}
	
	public static void retunUserenterEmailAddress(WebDriver wd, String emailaddress) {
		WebElement retunUseremailadd = wd.findElement(By.xpath(".//*[@data-test-id='login_input_email']"));
		retunUseremailadd.sendKeys(emailaddress);
	}

	public static void retunUserenterPassword(WebDriver wd, String password) {
		WebElement retunUserpassword1 = wd.findElement(By.xpath(".//*[@data-test-id='login_input_password']"));
		retunUserpassword1.sendKeys(password);
	}
	public static void retunUserClickSubmit(WebDriver wd) {
		WebElement retunUserSubmitButton = wd.findElement(By.xpath(".//*[@data-test-id='login_button_submit']"));
		retunUserSubmitButton.submit();
	}
	
	/*
	 * New user Account creation section
	 */
	public static void enterFirstName(WebDriver wd, String firstName) {
		WebElement firstName1 = wd.findElement(By.xpath(".//*[@data-test-id='register_input_firstname']"));
		firstName1.sendKeys(firstName);
	}
	
	public static void enterLastName(WebDriver wd, String lastName) {
		WebElement lastName1 = wd.findElement(By.xpath(".//*[@data-test-id='register_input_lastname']"));
		lastName1.sendKeys(lastName);
	}
	
	public static void enteremailAddress(WebDriver wd, String emailaddress) {
		WebElement emailadd = wd.findElement(By.xpath(".//*[@data-test-id='register_input_email']"));
		emailadd.sendKeys(emailaddress);
	}

	public static void enterPassword(WebDriver wd, String password) {
		WebElement password1 = wd.findElement(By.xpath(".//*[@data-test-id='register_input_password']"));
		password1.sendKeys(password);
	}
	
	public static void selectTCCheckbox(WebDriver wd) {
		WebElement checkbox = wd.findElement(By.xpath(".//*[@data-test-id='checkbox_terms']"));
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
	}
	
	public static void clickRegistertButton(WebDriver wd) {
		WebElement RegisterButton = wd.findElement(By.xpath(".//*[@data-test-id='register_button_submit']"));
		RegisterButton.click();
	}
	
}
