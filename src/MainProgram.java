
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainProgram {

	 
	public static void main(String...s) throws InterruptedException { 

	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rahul.choudhary\\Downloads\\geckodriver.exe");
		WebDriver cd = new FirefoxDriver();
		cd.get("https://www.google.com");
		cd.findElement(By.xpath("//div[@id='gs_lc0']")).sendKeys("president of america in 2017");
		cd.findElement(By.xpath("//button[@id='_fZl']/span")).click();
		Thread.sleep(10000);
		WebElement wb1 = cd.findElement(By.xpath("//div[text()='Donald Trump']"));
		
		Thread.sleep(10000);
		String p = "Donald";
		
		if(wb1!=null)
		{	wb1.click();
		
		Thread.sleep(15000);
		String wb3 = cd.findElement(By.xpath("//span[text()='Donald Trump']")).getText();
	System.out.println(wb3);
	Thread.sleep(15000);
       
        if(wb3==p)
        {
        	System.out.println("Welcome Donald Trump");
        }
        
       else
		{
			Thread.sleep(10000);
			WebElement wb2 = cd.findElement(By.xpath("//div[text()='Barack Obama']"));
			wb2.click();
		 Thread.sleep(20000);
		 String wb4 = cd.findElement(By.xpath("//span[text()='Barack Obama']")).getText();
			System.out.println(wb4);
			
			if(wb4.equalsIgnoreCase("Barack Obama"))
			{
				System.out.println("Welcome about Obama");
				Thread.sleep(5000);
				cd.quit();
			}
			
				else
			{
				System.out.println("Wrong page");
			}
		 
		}
		
		}
	}	
	}

