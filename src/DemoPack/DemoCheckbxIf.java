package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCheckbxIf {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://krninformatix.com/sample.html");
		
		boolean status = driver.findElement(By.id("rem")).isSelected();
		System.out.println(status);
		if (!status) {
			driver.findElement(By.id("rem")).click();
		} 
		boolean status2 = driver.findElement(By.id("rem")).isSelected();
		System.out.println(status2);
		}
	}
	

