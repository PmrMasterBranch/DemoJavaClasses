package demoPack1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDynamicXpathAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobilecase");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//h2[contains(@attribute,a-size)]/a)[1]")).click();
		driver.findElement(By.xpath("(//h2[contains(@attribute,a-size)]/a)[2]")).click();

		Set<String>allwind=driver.getWindowHandles();
		Iterator<String>preswind = allwind.iterator();
		String firstwindow = preswind.next();
		String secondwindow = preswind.next();
		String thirdwindow = preswind.next();
		driver.switchTo().window(secondwindow);
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.switchTo().window(thirdwindow);
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.switchTo().window(firstwindow);
		driver.findElement(By.id("nav-cart-count")).click();
		driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]/../../../../../../../div[1]/span[2]/span")).click();
		
	}

}
