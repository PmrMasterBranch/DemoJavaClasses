package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demologo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","d:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		boolean logostatus = driver.findElement(By.xpath("//div[@class=\"atLogoImg\"]")).isDisplayed();
		System.out.println(logostatus);
	}

}
