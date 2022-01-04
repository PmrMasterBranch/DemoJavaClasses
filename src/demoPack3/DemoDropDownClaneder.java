package demoPack3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DemoDropDownClaneder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='5']")).click();
		
		if(driver.findElement(By.xpath("(//div[@id='Div1'])[1]")).getAttribute("style").contains("0.5")) {
			System.out.println("Second Calender is disabled");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Second Calender is enabled");
			Assert.assertFalse(false);
				
			
		}
	
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		for(int i=0;i<6;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "7 Adult");
		
		WebElement DropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dd = new Select(DropDown);
		dd.selectByVisibleText("USD");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}
