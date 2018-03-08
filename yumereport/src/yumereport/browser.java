package yumereport;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.grid.web.servlet.beta.WebProxyHtmlRendererBeta;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import utils.ExcelUtils;

public class browser {
	static String reportpage="http://ads.yumenetworks.com/yumeweb/advertiser/reporting.do?_tabId=0A4001240161D841748A981F18FE14FD&uId=k7vE105PwBE%3D%0D%0A&nId=aiXzTW6cpqU%3D%0D%0A&&send=reporting";
	static WebDriver driver;
	static String excelpath="D:\report\report.xlsx";
	public static void main(String[] args) {
		int ColNum=0;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(23, TimeUnit.SECONDS);
		driver.navigate().to("https://ads.yumenetworks.com/yumeweb/login.do?forward=login");
		driver.findElement(By.name("userId")).sendKeys("directors@avezatech.com");
		driver.findElement(By.name("userPassword")).sendKeys("checkin@Aveza2015"+Keys.ENTER);
		//driver.navigate().to(reportpage);
		
		driver.findElement(By.xpath("//h4[text()='Reporting']")).click();
		
		driver.findElement(By.xpath("//a[text()='Billing']")).click();
		List<WebElement> tit=driver.findElements(By.xpath("//tr[@class='evenrow']/th"));
		for (WebElement webElement : tit) {
			
			
			try {
				
				Excelcreation(0, ColNum, webElement.getText());
				
				
				
				System.out.println(webElement.getText());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ColNum++;
		}
		
		
	}
	
	public static void selectdrop(String locatot, String slecttext) {
		
		WebElement element =driver.findElement(By.xpath(locatot));
		
		Select s=new Select(element);
		
		s.selectByValue(slecttext);
		
		
	}
	public  static  void Excelcreation(int row,int creatcel,String data) {
		try {
			
			XSSFWorkbook work=new XSSFWorkbook();
			
			FileOutputStream fos=new FileOutputStream(new File("D:\\report\\report1.xlsx"));
			XSSFSheet she=work.createSheet("praveen");
			Row r=she.createRow(row);
			r.createCell(creatcel).setCellValue(data);
			work.write(fos);
			System.out.println("done file writing");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

}
