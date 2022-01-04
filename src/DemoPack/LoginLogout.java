package DemoPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout {

	
	public static  void main(String[] args)
	{
		ExcelLibrary gd = new ExcelLibrary();
		int count = gd.lastRow("Sheet1");
		System.setProperty("webdriver.chrome.driver", "D://Java_New//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		for(int i=1;i<=count;i++)
		{
			String un = gd.getExcelData("Sheet1", i, 0);
			String pwd = gd.getExcelData("Sheet1", i, 1);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		}
		
	}
}
	

