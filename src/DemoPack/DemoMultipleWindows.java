package DemoPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d://Java_new//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rahulshettyacademy.com/");
		Set<String> allwind = driver.getWindowHandles();
		Iterator<String> it = allwind.iterator();
		String parentID= it.next();
		String childID= it.next();
		driver.switchTo().window(childID);
		String firstcourse = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		System.out.println(firstcourse);
		driver.switchTo().window(parentID);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(firstcourse);
		File scr = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("d:\\Java_new\\scr.png"));
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
	}

}
