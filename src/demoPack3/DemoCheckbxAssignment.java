package demoPack3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoCheckbxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Chckbx1 = driver.findElement(By.id("checkBoxOption1"));
		Assert.assertFalse(Chckbx1.isSelected());
		Chckbx1.click();
		Assert.assertTrue(Chckbx1.isSelected());
		Chckbx1.click();
		Assert.assertFalse(Chckbx1.isSelected());
		int allcheckbx = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		Assert.assertEquals(3, driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
