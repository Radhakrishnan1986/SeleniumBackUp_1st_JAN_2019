package webelementTest;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://apps.na.collabserv.com/manage/account/public/federatedIdentity/execute");

		//To delete all cookies
		//wd.manage().deleteAllCookies();
		
		//To inject cookie manually
		//Cookie c = new Cookie("Company", "Vmetry");
		//wd.manage().addCookie(c);

		Set<Cookie> s = wd.manage().getCookies();
		Iterator<Cookie> it = s.iterator();
		while (it.hasNext()) {
			Cookie mc = it.next();
			String domine = mc.getDomain();
			Date date = mc.getExpiry();
			String name = mc.getName();
			String path = mc.getPath();
			String value = mc.getValue();
			System.out.println(domine + " " + date + " " + name + " " + path + " " + value);
		}
		// To note, SYSO below is for user information only, that program has run.
		System.out.println("Completed");
	}

}
