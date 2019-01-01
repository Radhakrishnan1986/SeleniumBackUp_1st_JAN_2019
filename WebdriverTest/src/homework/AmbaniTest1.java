package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmbaniTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://en.wikipedia.org/wiki/Mukesh_Ambani");
		String startXpath = "html/body/div[3]/div[3]/div[4]/div/p[";
		String endXpath = "]";

		int i = 2;
		int count = 1; 
		while (true) {
			try {
				String xpath = startXpath+ i +endXpath;
				WebElement paraXpath = wd.findElement(By.xpath(xpath));
				String paragraph = paraXpath.getText();

				if(paragraph.contains("Ambani")) {
					System.out.println("Paragraph"+" "+count+" "+"contains the word Ambani");
				}
				else {
					System.err.println("Paragraph"+" "+count+" "+"does not contains the word Ambani");
				}
				
				i++;
				count++;
			} 
			catch (Exception e) {
				break;
			}
		}
	}
}