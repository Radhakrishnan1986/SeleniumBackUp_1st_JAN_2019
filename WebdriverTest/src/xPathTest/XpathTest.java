package xPathTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.bing.com/");
		WebElement input = wd.findElement(By.xpath(".//*[contains(@id,'scpl4')]/preceding::a[1]"));
		//input.sendKeys("abc");
		//input.sendKeys(Keys.ENTER);
		String output = input.getText();
		System.out.println(output);
		//input.click();
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].click();", input);
		
//		//span[contains(text(),'languages')]
//		//span[contains(text(),'languages')]
//		//input[contains(@class,'b_searchbox')]
//		//input[contains(@id,'sb_form_q')]
//		//input[contains(@name,'q')]
//		//input[contains(@title,'Enter your search term')]

//		//span[contains(text(),'Langu')]/following::a[2]
//		//*[contains(@id,'scpl4')]/preceding::a[2]
//		//*[@id="scpl2"]
		
//		(//*[@class='checkout-buttons-content__item button continue-checkout'])[3]
//		//a[@data-test-id='cart_primarycheckout']
//		//section[@class='checkout viewcart clearfix js-checkout-container']/div//a[@class='checkout-buttons-content__item button continue-checkout']

// //*[@data-test-id='cart_primarycheckout']
// //*[contains(@data-test-id,'cart_primarycheckout')]		
		
	}	

}
