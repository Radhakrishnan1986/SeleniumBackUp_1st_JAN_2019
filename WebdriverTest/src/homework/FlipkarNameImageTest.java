package homework;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkarNameImageTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/search?q=samsung&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		String startXpathimage = "html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[";
		String endXPathimage = "]/div/div/div/a/div[2]/div[1]/div/div/img";
		String startXpathname = "html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[";
		String endXpathname = "]/div/div/div/a/div[3]/div[1]/div[1]";
		
		int i = 2;
		while (true) {
			try {
			String imageXpath = startXpathimage + i + endXPathimage;
			String nameXpath = startXpathname + i+ endXpathname;
			System.out.println(nameXpath);
			i++;
			WebElement element = wd.findElement(By.xpath(imageXpath));
			WebElement name = wd.findElement(By.xpath(nameXpath));
			String mobilename = name.getText();
			System.out.println(mobilename);
			Point point = element.getLocation();
			int x = point.x;
			int y = point.y;
			int height = element.getSize().height;
			int width  = element.getSize().width;
			File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);			
			BufferedImage copyimage = ImageIO.read(src);
			BufferedImage cropimage = copyimage.getSubimage(x, y, width, height);
			ImageIO.write(cropimage, "png", src);
			FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\WebdriverTest\\Screenshot\\"+mobilename+".png"));
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor)wd;
			js.executeScript("window.scrollBy(0,450)");
			}
			catch (Exception e) {
				break;
			}
		}
	}
}
