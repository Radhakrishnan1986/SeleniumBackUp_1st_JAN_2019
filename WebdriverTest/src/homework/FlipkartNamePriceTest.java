package homework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FlipkartNamePriceTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		
		WebDriver wd = new FirefoxDriver(profile);
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/search?q=samsung&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		String sXpathname = "html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[";
		String eXpathname = "]/div/div/div/a/div[3]/div[1]/div[1]";
		String sXpathprice = "html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[";
		String eXpathprice = "]/div/div/div/a/div[3]/div[2]/div[1]/div/div[1]";	
		
		int i = 6;
		while (true) {
		//	try {
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(6000);
			String nameXpath = sXpathname + i+ eXpathname;
			String priceXpath = sXpathprice + i + eXpathprice;
			WebElement productname= wd.findElement(By.xpath(nameXpath));
			WebElement productprice= wd.findElement(By.xpath(priceXpath));	
			String name = productname.getText();
			String price = productprice.getText();
			System.out.println(name);
			
			Set<String> s = wd.getWindowHandles();
			Iterator<String> it = s.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			/*productname.click();
			Set<String> s= wd.getWindowHandles();
			Iterator<String> it = s.iterator();
			String parentwindow = it.next();
			String childwindow = it.next();
			wd.switchTo().window(childwindow);
            WebElement addbutton = wd.findElement(By.xpath("html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
			addbutton.click();
			Thread.sleep(2000);
            wd.switchTo().window(parentwindow);*/


			//i++;
}
		/*	catch (Exception e) {
				break;
			}*/
		//}
	}
}
