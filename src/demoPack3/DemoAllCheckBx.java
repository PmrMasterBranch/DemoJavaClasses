package demoPack3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAllCheckBx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/learn.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> allchkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<allchkbox.size();i++) {
			WebElement checkBoxi = allchkbox.get(i);
			checkBoxi.click();
		}
	}

}
