package genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamplesPage {
	public static void selectSamplebutton(WebDriver wd) {
		WebElement selectsamplebutton = wd.findElement(By.xpath(".//*[@id='checkout_samples']/div/div/div/ul/li[1]/div[3]/ul/li"));
		selectsamplebutton.click();
}
	public static void clickContinuebutton(WebDriver wd) {
		WebElement continuebutton = wd.findElement(By.xpath(".//*[@data-test-id='form_checkout_samples_continue']"));
		continuebutton.click();
}
	
	public static void clickNoThankslink(WebDriver wd) {
		WebElement noThankslink = wd.findElement(By.xpath(".//*[contains(text(),'No Thanks')]"));
		//.//*[@data-test-id='form_checkout_samples_continue']
		noThankslink.click();
}
}