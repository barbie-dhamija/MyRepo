import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GenericProgram {

	public static void main(String[] args) throws InterruptedException {
		
		String p = "Donald";
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rahul.choudhary\\Downloads\\geckodriver.exe");
		WebDriver cd = new FirefoxDriver();
		
		cd.get("https://www.google.com");
		cd.findElement(By.xpath("(//div[@id='gs_lc0'])")).sendKeys("president of america in 2017");
		Actions ae = new Actions(cd);
		cd.findElement(By.xpath("//div[@id='sfdiv']/button")).click();
		Thread.sleep(10000);
		List<WebElement> lt = cd.findElements(By.xpath("(//div[@class='_Mjf']/div)"));
		System.out.println("elements in list is " +lt.size());
		Thread.sleep(10000);
     	for(int i=0;i<lt.size();i++)
		{
			lt.get(i).click();
			Thread.sleep(10000);
		}
		}
}
