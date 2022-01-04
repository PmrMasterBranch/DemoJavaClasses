package demoPack3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsDemo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Name= "Madhu";
		System.setProperty("webdriver.chrome.driver", "d:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys(Name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(3000);
		String LoginMessage = driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();
		System.out.println(LoginMessage);
		
		}

}
