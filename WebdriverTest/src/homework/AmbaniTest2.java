package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmbaniTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://en.wikipedia.org/wiki/Mukesh_Ambani");
		WebElement path = wd.findElement(By.xpath("html/body/div[3]/div[3]/div[4]/div/p[6]"));
		String s1 = path.getText();
		System.out.println(s1);

		String[] data = s1.split(" ");
		String s2 = "Ambani";

		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i].trim().equals(s2)) {
				count++;
			}
		}

		if (count != 0) {
			System.out.println("The word Ambani is repeated"+" "+ count +" "+ "times in this paragraph");
		} else {
			System.out.println("The word Ambani is not displyed in this paragraph");
		}
	}
}