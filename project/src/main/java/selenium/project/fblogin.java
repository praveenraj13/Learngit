package selenium.project;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class fblogin 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "./jars/chromedriver.exe");
    	WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(23, TimeUnit.SECONDS);
    	driver.get("https://www.facebook.com/");
    	System.out.println(driver.getTitle());
    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9003204363");
    	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("praveen"+Keys.ENTER);
    	
    	
    	
    	
    	
   
    }
}
