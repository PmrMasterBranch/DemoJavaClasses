package demoPack3;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		Wait<WebDriver> Explict = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class);
		
	
		

		
		
	}
	public static WebElement apply(WebDriver driver)
	{
		if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
		{
			return driver.findElement(By.cssSelector("[id='finish'] h4"));
		}
		else
		{
			return null;
		}
	}

}
