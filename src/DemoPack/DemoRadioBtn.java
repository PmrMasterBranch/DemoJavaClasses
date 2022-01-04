package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://krninformatix.com/sample.html");
		
		boolean status1 = driver.findElement(By.id("female")).isSelected();
		System.out.println(status1);
		
		driver.findElement(By.id("female")).click();
		
		boolean status2 = driver.findElement(By.id("female")).isSelected();
		System.out.println(status2);
	}

}
