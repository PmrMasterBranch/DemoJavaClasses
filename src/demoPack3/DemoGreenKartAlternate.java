package demoPack3;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGreenKartAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String[] itemNeeded = {"Brocolli","Walnuts","Brinjal"};
		int j = 0;
		List listitemneeded = Arrays.asList(itemNeeded);
		List<WebElement> alllist = driver.findElements(By.xpath("//div[@class='product'] //h4[@class='product-name']"));
		
		for(int i=0;i<alllist.size();i++)
		{
			String[] name = alllist.get(i).getText().split("-");
			String frmtname = name[0].trim();
			if(listitemneeded.contains(frmtname))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			if(!(j<listitemneeded.size()))
			{
				break;
			}
		}
	}

}
