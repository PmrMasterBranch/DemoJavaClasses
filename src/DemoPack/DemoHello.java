package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoHello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("This is First Program");
		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
	}

}
