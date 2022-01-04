package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearingFeild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("madhu");
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).clear();
		
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
			
		
	}

}
