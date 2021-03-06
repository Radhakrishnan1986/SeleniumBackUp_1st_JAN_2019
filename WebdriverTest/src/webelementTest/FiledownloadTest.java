package webelementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FiledownloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxProfile profile = new FirefoxProfile();

		String path = "C:\\SeleniumWorkspace\\WebdriverTest\\downloads";

		profile.setPreference("browser.download.folderList", 2);

		profile.setPreference("browser.download.dir", path);

		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"application/msword,application/csv,text/csv,image/png ,"
						+ "image/jpeg, application/pdf, text/html,text/plain," + "application/octet-stream"
						+ "application/x-msexcel,application/excel,application/x-excel,application/excel,"
						+ "application/x-excel,application/excel,application/vnd.ms-excel,"
						+ "application/x-excel,application/x-msexcel");

		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showWhenStarting", false);

		profile.setPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
		profile.setPreference("pdfjs.disabled", true);

		WebDriver wd = new FirefoxDriver(profile);
		wd.manage().window().maximize();
		wd.get("http://www.resumeworld.ca/resume-templates/types-resume-templates/curriculum-vitae-resume-template.html");
		WebElement download = wd
				.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div/table/tbody/tr[1]/td[1]/u/a"));
		download.click();

	}

}
