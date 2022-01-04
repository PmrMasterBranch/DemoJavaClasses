package demoPack3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> alllinks =  driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<alllinks.size();i++) {
			WebElement link= alllinks.get(i);
			String Strlink = link.getText();
			System.out.println(Strlink);
		}
		
	}

}
