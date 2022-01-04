package demoPack3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DemoExplicitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Actualstr = "Process completed! This response has been loaded via the Ajax request directly from the web server, without reoading this page.";
		System.setProperty("webdriver.chrome.driver", "D:\\java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait Ew = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		Ew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		String expstr = driver.findElement(By.xpath("//div[@id='results']")).getText();
		System.out.println(expstr);
		Assert.assertEquals(Actualstr, expstr);
	}

}
