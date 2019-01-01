package imagingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CoordinatesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement logo = wd.findElement(By.id("hplogo"));
		Point point = logo.getLocation();
		int x = point.x;
		int y = point.y;
		int height = logo.getSize().height;
		int width  = logo.getSize().width;
		System.out.println("X xais Value: "+ x);
		System.out.println("Y Axis Value: "+ y);
		System.out.println("Height of image is: "+ height);
		System.out.println("Width of image is: "+ width);
	}

}