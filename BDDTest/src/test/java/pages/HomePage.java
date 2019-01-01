package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public static void enterusername(WebDriver wd, String Username) {
	WebElement name = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[2]"));
	name.sendKeys(Username);
	}
	public static void enterMobilenumber(WebDriver wd, String mobilenumber) {
		WebElement mobnum = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[3]"));
		mobnum.sendKeys(mobilenumber);
	}

	public static void enterPickupplace(WebDriver wd, String pickupplace) {
		WebElement pick = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[4]"));
		pick.sendKeys(pickupplace);

	}

	public static void enterDropplace(WebDriver wd, String dropplace) {
		WebElement drop = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[7]"));
		drop.sendKeys(dropplace);
	}

	public static void selectCartype(WebDriver wd, String vehicletype) {
		WebElement vtype = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/select[1]"));
		Select s = new Select(vtype);
		s.selectByVisibleText(vehicletype);
	}

}
