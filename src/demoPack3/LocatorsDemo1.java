package demoPack3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Madhu");
		driver.findElement(By.name("inputPassword")).sendKeys("Madhusuudhanreddy");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Madhu");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("madhu@sudhan.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Madhu@gmail.com");
		driver.findElement(By.xpath("(//form/input)[3]")).sendKeys("9909027955");
		driver.findElement(By.cssSelector("div button:nth-child(2)")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("button[class*='go-to']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'input')]")).sendKeys("madhu");
		driver.findElement(By.xpath("//form[@class='form']/input[2]")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		

		
	}

}
