package Java1Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String Month = "April";
		String Day= "23";
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class = 'datepicker-switch']")).getText().contains(Month))
		{
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class = 'next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		int count = dates.size();
		for(int i=0;i<count;i++) {
			if(driver.findElements(By.cssSelector(".day")).get(i).getText().equalsIgnoreCase(Day))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
		
	}

}
