package homework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomatingSalceforceSiteTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.salesforce.com/in/products/");
		WebElement products = wd.findElement(By.xpath(
				"html/body/header/div[2]/div/div[2]/div/div[3]/div/div/div/nav/div[1]/div/div[2]/div/ul/li[1]/h2/a"));
		WebElement sbs = wd.findElement(By.xpath(
				"html/body/header/div[2]/div/div[2]/div/div[3]/div/div/div/nav/div[1]/div/div[2]/div/ul/li[1]/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[3]/h4/a/span"));

		Actions a = new Actions(wd);
		a.moveToElement(products).build().perform();
		a.moveToElement(sbs).build().perform();
		a.click(sbs).build().perform();

		WebElement startmytrail = wd.findElement(By.xpath(
				"html/body/div[3]/div[2]/div[1]/div/div[6]/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div/a"));
		a.moveToElement(startmytrail).build().perform();
		a.click(startmytrail).build().perform();

		Thread.sleep(4000);
		WebElement message1 = wd.findElement(By.xpath("html/body/div[4]/div[2]/div/div/div[1]/h2/a/span"));
		System.out.println(message1.getText());
		 WebElement trysalebutton = wd.findElement(By.xpath(
		 "html/body/div[4]/div[2]/div/div/div[2]/div/div[2]/div[1]/div[3]/div/div/div/a"
		 )); 
		 trysalebutton.click();

		Set<String> s = wd.getWindowHandles();
		Iterator<String> it = s.iterator();

		String parentId = it.next();
		String childId = it.next();
		wd.switchTo().window(childId);
		WebElement firstname = wd.findElement(
				By.xpath("html/body/div[3]/div[1]/div[2]/div/div/div[3]/div/form/div/ul/li[1]/div/div[2]/input"));
		firstname.sendKeys("Rad");
		WebElement lastname = wd.findElement(
				By.xpath("html/body/div[3]/div[1]/div[2]/div/div/div[3]/div/form/div/ul/li[2]/div/div[2]/input"));
		lastname.sendKeys("Krish");
		/*WebElement jobtitle = wd.findElement(
			By.xpath("html/body/div[3]/div[1]/div[2]/div/div/div[3]/div/form/div/ul/li[3]/div/div[2]/a/span[1]"));
		Select s1 = new Select(jobtitle);
		s1.selectByVisibleText("Sales Manager");*/
		WebElement emailid = wd.findElement(
				By.xpath("html/body/div[3]/div[1]/div[2]/div/div/div[3]/div/form/div/ul/li[4]/div/div[2]/input"));
		emailid.sendKeys("a@a.com");
		WebElement phone = wd.findElement(
				By.xpath("html/body/div[3]/div[1]/div[2]/div/div/div[3]/div/form/div/ul/li[5]/div/div[2]/input"));
		phone.sendKeys("999999999");
		WebElement company = wd.findElement(
				By.xpath("html/body/div[3]/div[1]/div[2]/div/div/div[3]/div/form/div/ul/li[6]/div/div[2]/input"));
		company.sendKeys("abcabc");
		/*WebElement employees = wd.findElement(
				By.xpath("html/body/div[3]/div[1]/div[2]/div/div/div[3]/div/form/div/ul/li[7]/div/div[2]/a/span[1]"));
			Select s2 = new Select(employees);
			s2.selectByVisibleText("101 - 500 employees");
		WebElement country = wd.findElement(
					By.xpath("html/body/div[3]/div[1]/div[2]/div/div/div[3]/div/form/div/ul/li[8]/div/div[2]/a/span[1]"));
				Select s3 = new Select(country);
				s3.selectByVisibleText("United States");*/
		WebElement subbutton = wd.findElement(
				By.xpath("html/body/div[3]/div[1]/div[2]/div/div/div[3]/div/form/div/div[2]/div/a"));
		Thread.sleep(6000);		
		subbutton.click();	
		//wd.close();
		wd.switchTo().window(parentId);
		WebElement message2 = wd.findElement(By.xpath("html/body/div[4]/div[2]/div/div/div[1]/h2/a/span"));
		System.out.print(message2.getText());
	}

}