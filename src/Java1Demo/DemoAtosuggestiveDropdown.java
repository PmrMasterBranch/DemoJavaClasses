package Java1Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoAtosuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String name = "au";
		String country = "Australia";
		driver.findElement(By.id("autocomplete")).sendKeys(name);
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase(country)) {
				list.get(i).click();
				break;
			}
				
		}
		String expected = driver.findElement(By.id("autocomplete")).getAttribute("value");
		System.out.println(expected);
		Assert.assertEquals("Australia", expected);
	}

}
