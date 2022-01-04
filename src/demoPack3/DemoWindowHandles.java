package demoPack3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> allhandles = driver.getWindowHandles();
		Iterator<String> listhanldes = allhandles.iterator();
		String parentid = listhanldes.next();
		String childid = listhanldes.next();
		
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4];
		
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(email);
		
		
		
		
	}

}
