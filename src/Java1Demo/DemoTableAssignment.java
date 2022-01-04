package Java1Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTableAssignment {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println(driver.findElement(By.cssSelector("table.table-display tbody tr:nth-child(3)")).getText());
		
		System.out.println(driver.findElements(By.cssSelector("table.table-display tbody tr")).size());
		
		System.out.println(driver.findElements(By.cssSelector("table.table-display tbody tr th")).size());
	}
}
