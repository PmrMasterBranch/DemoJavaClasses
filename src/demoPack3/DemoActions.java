package demoPack3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		WebElement signin = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(signin).build().perform();
		a.moveToElement(Search).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	}

}
