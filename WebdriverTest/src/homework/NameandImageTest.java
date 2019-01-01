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

public class NameandImageTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("file:///D:/RK/WebelementsfromVinoth/image.html");
		String imagestartXpath = "html/body/img[";
		String imageendXpath = "]";
		String namestartXpath = "html/body/p[";
		String nameendXpath = "]";

		int i = 1;
		while (true) {
			try {

				String image = imagestartXpath + i + imageendXpath;
				String name = namestartXpath + i + nameendXpath;

				WebElement imageXpath = wd.findElement(By.xpath(image));
				Point point = imageXpath.getLocation();
				int x = point.x;
				int y = point.y;
				int width = imageXpath.getSize().width;
				int height = imageXpath.getSize().height;
				WebElement nameXpath = wd.findElement(By.xpath(name));
				String imagename = nameXpath.getText();
				Thread.sleep(3000);
				File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
				BufferedImage copyimage = ImageIO.read(src);
				BufferedImage cropimage = copyimage.getSubimage(x, y, width, height);
				ImageIO.write(cropimage, "JPG", src);
				FileUtils.copyFile(src,new File("C:\\SeleniumWorkspace\\WebdriverTest\\Screenshot\\" + imagename + "jpeg"));
				
				JavascriptExecutor js = (JavascriptExecutor)wd;
				js.executeScript("window.scrollBy(0,300)");
				i++;
			} 
			catch (Exception e) {
				break;
			}

		}
	}

}
