package demoPack3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.*;

public class DemoCleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cleartrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[2]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("HYD");
		Thread.sleep(5000);
		List<WebElement> alloptionsinput = driver.findElements(By.xpath("//p[@class='to-ellipsis o-hidden ws-nowrap c-inherit fs-3']"));
		for(WebElement presentoption:alloptionsinput) 
		{
			if(presentoption.getText().contains("HYD"))
			{
				System.out.println(presentoption.getText());
				presentoption.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("DEL");	
		List<WebElement> alloptionsoutput = driver.findElements(By.xpath("//p[@class='to-ellipsis o-hidden ws-nowrap c-inherit fs-3']"));
			for(WebElement presentoutput:alloptionsoutput) 
			{
				if(presentoutput.getText().contains("DEL"))
				{
					System.out.println(presentoutput.getText());
					presentoutput.click();
					break;
				}
		}
		
		driver.findElement(By.xpath("//button[@style='min-width: 185px;'][1]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@aria-label,'Nov 23 2021')]")).click();
		driver.findElement(By.xpath("//div[contains(@aria-label,'Dec 06 2021')]")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[1]"));
		Select dd= new Select(dropdown);
		dd.selectByValue("4");
		driver.findElement(By.xpath("//a[@href='javascript:void(0);']")).click();
		WebElement dropdown2 = driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[4]"));
		Select dd2 = new Select(dropdown2);
		dd2.selectByVisibleText("Business");
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("indi");
		//Thread.sleep(5000);
		List<WebElement> airlinelist = driver.findElements(By.xpath("//p[@class='to-ellipsis o-hidden ws-nowrap c-inherit fs-3']"));
		for(WebElement presentairline : airlinelist)
		{
			if(presentairline.getText().contains("IndiGo"))
			{
				presentairline.click();
				break;
			}
		}
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
	}
}

