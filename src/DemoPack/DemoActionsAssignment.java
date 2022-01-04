package DemoPack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DemoActionsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement courseOffered = driver.findElement(By.xpath("//span[text()='Courses Offered']"));
		//WebElement manualtesting = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		//WebElement softwaretestong = driver.findElement(By.xpath("//span[text()='Software Testing']"));
		//WebElement link = driver.findElement(By.xpath("//a[text()='This is a link']"));
		
		//Actions act = new Actions(driver);
		
		//act.moveToElement(link).contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		
		
		//manualtesting.click();
		//driver.manage().window().setSize(new Dimension(1024,768));
		//act.contextClick(courseOffered).perform();
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//act.sendKeys(Keys.ENTER).perform();
		//act.sendKeys("T").perform();
		//WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		//Select staticdp = new Select(staticdropdown);
		
//		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Madhu");
//		driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
//		driver.findElement(By.xpath("//input[@id='male']")).click();
//		driver.findElement(By.xpath("//input[@id='female']")).click();
//		driver.findElement(By.xpath("//input[@value='Automation']")).click();
//		driver.findElement(By.xpath("//input[@value='Performance']")).click();
//		
//		staticdp.selectByIndex(1);
//		staticdp.selectByValue("Manual");
//		
		//act.doubleClick(driver.findElement(By.xpath("//button[@id='dblClkBtn']"))).perform();
		//driver.switchTo().alert().accept();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		WebElement target = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
//		WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));
//		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		act.dragAndDrop(Source, target).perform();
//		String str = "123";
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("in");
		//List<WebElement> ddlist = driver.findElements(By.xpath("(//table)[2]//td[last()]"));
		//System.out.println(ddlist.size());
		//List<WebElement> price = driver.findElements(By.xpath("(//table)[2]//td[last()]"));
//		int sum=0;
//		for(int i=0;i<price.size();i++) {
//			String priceloop = price.get(i).getText();
//			int intpriceloop= Integer.parseInt(priceloop);
//			sum=sum+intpriceloop;
//		}
//		System.out.println(sum);
		WebElement footdriver = driver.findElement(By.xpath("//table[@class='gf-t']/tbody"));
		List<WebElement> footlinks = footdriver.findElements(By.xpath(".//a"));
		int respcode = 200;
		System.out.println(footlinks);
		for(int i=0;i<footlinks.size();i++) {
		
		
		
		try {
			URL myURL = new URL(footlinks.get(i).getAttribute("href"));
			HttpURLConnection myURLConnection = (HttpURLConnection) myURL.openConnection();
			myURLConnection.setRequestMethod("HEAD");
			myURLConnection.connect();
			respcode = myURLConnection.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//HttpURLConnection huc = new HttpURLConnection();
			
		if(respcode>=400) {	
			System.out.println("Link failed : " + footlinks.get(i).getAttribute("href")+respcode );
			
		}else {
			System.out.println("All limks are ok");
		}
		}
	}
		
		
		
		
	

}
