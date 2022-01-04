package DemoPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class DemoRelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d://Java_new//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement name = driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
		
		WebElement gender = driver.findElement(By.cssSelector("label[for='exampleFormControlSelect1']"));
		driver.findElement(with(By.tagName("select")).below(gender)).click();
		
		WebElement chkbox = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(chkbox)).getText());
		
		WebElement employed = driver.findElement(By.cssSelector("label[for='inlineRadio2']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(employed)).click();
		
	}

}
