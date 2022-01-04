package demoPack3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demopopup2_Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String currenthandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("AppleAirpods");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("(//img[contains(@alt,'Apple AirPods')])[1]")).click();
		
		Set<String> allhandles= driver.getWindowHandles();
		for(String current : allhandles) {
			if(!current.equalsIgnoreCase(currenthandle)) {
				driver.switchTo().window(current);
						
			}
		}
		driver.findElement(By.xpath("(//span[@class = 'question'])[1]")).click();
		String poptext = driver.findElement(By.xpath("//div[@class='_2JH8X1']")).getText();
		System.out.println(poptext);
	}

}
