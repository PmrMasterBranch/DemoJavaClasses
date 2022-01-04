package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCheckbx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://krninformatix.com/sample.html");
		
		boolean Checkbxstatus1 = driver.findElement(By.id("rem")).isSelected();
		System.out.println(Checkbxstatus1);
		
		driver.findElement(By.id("rem")).click();
		
		boolean Checkboxstatus2 = driver.findElement(By.id("rem")).isSelected();
		System.out.println(Checkboxstatus2);
		
		driver.findElement(By.id("rem")).click();
		
		boolean Checkboxstatus3 = driver.findElement(By.id("rem")).isSelected();
		System.out.println(Checkboxstatus3);
	}

}
