package roughWorkTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RoughWork{

	public static void main(String[] args){
	
		//System.setProperty("webdriver.gecko.driver","C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\geckodriver.exe");
		//WebDriver wd = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.get("https://www.ntltaxi.com/");
		//PageobjectTest.enterUsername(wd, "Radhakrishnan");
		//PageobjectTest.enterpassword(wd, "123tester");
		
		PageobjectTest pageobjecttest = PageFactory.initElements(wd, PageobjectTest.class);
		pageobjecttest.enterUsername("Rad");
		pageobjecttest.enterpassword("123Testr");

	}
}
