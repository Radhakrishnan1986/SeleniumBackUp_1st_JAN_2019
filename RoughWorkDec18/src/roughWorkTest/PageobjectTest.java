package roughWorkTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageobjectTest {

	@FindBy(how=How.XPATH, using="//a/username=Test")
	public static WebElement username;
	public void enterUsername(String username) {
		this.username.sendKeys(username);
	}
	
	@FindBy(how=How.XPATH, using="")
	public static WebElement password;
	public void enterpassword(String password) {
		this.password.sendKeys(password);
	}
	
}
