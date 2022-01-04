package demoPack3;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DemoGreenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait ewait = new WebDriverWait(driver,Duration.ofSeconds(5));
		String[] itemNeeded = {"Brocolli","Walnuts","Brinjal"};
		
		int j=0;
		List<WebElement> Veegielist = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List itemneededlist = Arrays.asList(itemNeeded);
		for(int i=0;i<Veegielist.size();i++)
		{
			String[] name = Veegielist.get(i).getText().split("-");
			String forname = name[0].trim();
			if(itemneededlist.contains(forname))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			if(j==itemneededlist.size())
			{
				break;
			}
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		ewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		ewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		String Expectedstr=driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		Assert.assertEquals("Code applied ..!", Expectedstr);
}
}