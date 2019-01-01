package browserTest;

public class Snippet {
	Pattern gmail=  new Pattern("C:\\SeleniumWorkspace\\sikuliTest\\Locator\\gmail.PNG");
					
			// TODO Auto-generated method stub
			WebDriver wd = new FirefoxDriver();
			wd.manage().window().maximize();
			wd.get("https://www.google.com/");
			Screen s = new Screen();
			s.wait(gmail, 10);
			s.click(gmail);
}

