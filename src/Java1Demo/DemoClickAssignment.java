package Java1Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoClickAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("checkBoxOption2")).click();
		String option = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(option);
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText(option);
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		String gettext = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(gettext);
		
		if(gettext.contains(option))
		{
			System.out.println("Message is same");
		}
		else {
			System.out.println("Message is not same");
		}
		
	}

}
