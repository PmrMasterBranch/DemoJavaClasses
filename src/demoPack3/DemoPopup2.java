package demoPack3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPopup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String currentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("AppleAirpods");
		driver.findElement(By.className("L0Z3Pu")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'Apple AirPods')]")).click();
		
		
		Set<String> handles  =driver.getWindowHandles();
		for(String handlelist : handles) {
			System.out.println(handlelist);
		}
		
		for(String actual:handles) {
			if(!actual.equalsIgnoreCase(currentHandle)) {
				driver.switchTo().window(actual);
			}
		}
		
		driver.findElement(By.xpath("(//span[@class = 'question'])[1]")).click();
		String poptext = driver.findElement(By.xpath("//div[@class = '_1wrJ9h sguQRn _26G82D']")).getText();
		System.out.println(poptext);
	}

}
