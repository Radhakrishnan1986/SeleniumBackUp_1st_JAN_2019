package imagingTest;

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

public class ImageCropTest {

	public static void main(String[] args) throws IOException {
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
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		BufferedImage copyimage = ImageIO.read(src);
		BufferedImage cropimage = copyimage.getSubimage(x, y, width, height);
		ImageIO.write(cropimage, "png", src);
		FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\WebdriverTest\\Screenshot\\subimage.png"));

	}

}