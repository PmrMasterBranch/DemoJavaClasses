package DemoPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActionsAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Branches = driver.findElement(By.xpath("//span[text()='Branches']"));
		WebElement marthahali = driver.findElement(By.xpath("//span[text()='Marathahalli']"));
		WebElement seleniummar= driver.findElement(By.xpath("//a[text()='Selenium-Training-in-Marathahalli']"));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Branches).perform();
		act.moveToElement(marthahali).perform();
		act.moveToElement(seleniummar).keyDown(Keys.CONTROL).click().perform();
	}

}
