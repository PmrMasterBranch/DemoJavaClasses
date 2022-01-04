package DemoPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		TakesScreenshot ScrShot = ((TakesScreenshot)driver);
		
		File ScrFile = ScrShot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(ScrFile, new File("D:\\Java_New\\Scrshot.png"));
		
	}

}
