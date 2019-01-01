package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	@FindBy(how=How.XPATH, using="html/body/section/div/div[2]/div/form/input[2]")
	public static WebElement Username;
	public void enterUsername(String Username) {
		this.Username.sendKeys(Username);
	}
	
	@FindBy(how=How.XPATH, using="html/body/section/div/div[2]/div/form/input[3]")
	public static WebElement mobilenumber;
	public void enterMobilenumber(String mobilenumber) {
		this.mobilenumber.sendKeys(mobilenumber);	
	}
	
	@FindBy(how=How.XPATH, using="html/body/section/div/div[2]/div/form/input[4]")
	public static WebElement pickupplace;
	public void enterPickupplace(String pickupplace) {
		this.pickupplace.sendKeys(pickupplace);
	}
	
	@FindBy(how=How.XPATH, using="html/body/section/div/div[2]/div/form/input[7]")
	public static WebElement dropplace;
	public void enterDropplace(String dropplace) {
		this.dropplace.sendKeys(dropplace);
	}
	
	@FindBy(how=How.XPATH, using="html/body/section/div/div[2]/div/form/select[1]")
	public static WebElement cartype;
	public void selectCartype(String cartype) {
		Select s = new Select(this.cartype);
		s.selectByVisibleText(cartype);
	}

}
