package winiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class winiumTest {
	//gui-inspect-tool
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

	DesktopOptions op = new DesktopOptions();
	op.setApplicationPath("C:\\Windows\\System32\\calc.exe");
	WiniumDriver d = new WiniumDriver(new URL("http://localhost:9999"), op);
	
	Thread.sleep(5000);
	d.findElement(By.id("num1Button")).click();
	d.findElement(By.name("Two")).click();
	d.findElement(By.name("Three")).click();

	d.findElement(By.name("Plus")).click();
	
	d.findElement(By.name("One")).click();
	d.findElement(By.name("Two")).click();
	d.findElement(By.name("Three")).click();
	
	d.findElement(By.name("Equals")).click();

}
	
}