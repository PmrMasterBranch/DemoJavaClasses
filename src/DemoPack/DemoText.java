package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(10000);
		
		String Expectedtext = driver.findElement(By.xpath("(//td[@class=\"pagetitle\"])[1]")).getText();
		String ActualText = "Enter Time-Track";
		
		if (ActualText.equals(Expectedtext)) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}
				
				
	}

}
