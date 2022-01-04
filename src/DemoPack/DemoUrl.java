package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(20000);
		
		String ExceptedURL = "https://demo.actitime.com/user/submit_tt.do";
		String ActualURL = driver.getCurrentUrl();
		
		if (ActualURL.equals(ExceptedURL)) {
			System.out.println("Pass");
		} else {
			System.out.println("out");
		}
	}

}
