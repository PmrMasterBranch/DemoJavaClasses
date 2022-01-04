package demoPack3;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDownMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement multidropdownwe = driver.findElement(By.id("cities"));
		
		Select mdd = new Select(multidropdownwe);
		
		mdd.selectByIndex(1);
		mdd.selectByValue("1");
		mdd.selectByVisibleText("Delhi");
		
		
		
		List<WebElement> alloptions = mdd.getAllSelectedOptions();
		
		for(int i=0;i<alloptions.size();i++) {
			WebElement option1 = alloptions.get(i);
			String StrOption1 = option1.getText();
			System.out.println(StrOption1);
		}

		
	}

}
