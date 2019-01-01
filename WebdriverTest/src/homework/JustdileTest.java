package homework;

import java.util.Iterator;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JustdileTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.justdial.com/Mumbai/Estate-Agents-For-Residential-Rental/nct-10192844");
		Thread.sleep(2000);
		String namestartXpath = "html/body/div[2]/div[2]/div[2]/div[2]/div[1]/div/section/div/ul/li[";
		String nameendXpath = "]/section/div[1]/section/div[1]/h2/span/a/span";
		String votestartXpath = "html/body/div[2]/div[2]/div[2]/div[2]/div[1]/div/section/div/ul/li[";
		String voteendXpath = "]/section/div[1]/section/div[1]/p[1]/a/span[2]";

		TreeSet s = new TreeSet();

		int i = 1;
		while (true) {
			try {
				String nameXpath = namestartXpath + i + nameendXpath;
				String voteXpath = votestartXpath + i + voteendXpath;
				WebElement namelocaltion = wd.findElement(By.xpath(nameXpath));
				String name = namelocaltion.getText();
				WebElement votelocation = wd.findElement(By.xpath(voteXpath));
				String vote = votelocation.getText();
				//System.out.println(i+". "+name + ": " + vote);
				String data = vote + ": " + name;
				//String data = vote;
				//String data1 = data.replaceAll("[^0-9]", "");
				// data2 = Integer.parseInt(data1);
				s.add(data);
				JavascriptExecutor js = (JavascriptExecutor) wd;
				js.executeScript("window.scrollBy(0,200)");
				Thread.sleep(4000);

				WebElement pop = wd.findElement(By.xpath("html/body/section[15]"));
				if (pop.isDisplayed()) {
					pop.sendKeys(Keys.ESCAPE);
				}
				i++;
			} catch (NoSuchElementException e) {
				//System.out.println(e.getMessage());
				Iterator it = s.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			}
		}
	}
}