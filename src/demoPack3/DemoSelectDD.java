package demoPack3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelectDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement sdropdown = driver.findElement(By.id("city"));
		
		Select dd = new Select(sdropdown);
		
		dd.selectByIndex(0);
		dd.selectByValue("1");
		dd.selectByVisibleText("Delhi");
		
		List<WebElement> alloptions = dd.getOptions();
		
		WebElement Option2 = alloptions.get(3);
		String text2 = Option2.getText();
		System.out.println(text2);
	}

}
