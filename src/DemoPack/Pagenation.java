package DemoPack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://java_new//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='input-username']")).clear();
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");

		driver.findElement(By.xpath("//input[@id='input-password']")).clear();
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

		//		driver.findElement(By.xpath("//a[normalize-space()='>|']")).click();
		//		int pages = Integer.parseInt(driver.findElement(By.xpath("//ul[@class='pagination']//li[last()]")).getText());
		//		System.out.println(pages);

		String unsplittedstrinf = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		int pagecount = Integer.parseInt(unsplittedstrinf.split("\\(")[1].split(" ")[0]);

		System.out.println(pagecount);

		List<String> customer = new ArrayList<String>();
		List<String> status = new ArrayList<String>();
		for(int i=1; i<=2;i++) {
			String next = Integer.toString(i+1);
			int rowsize = driver.findElements(By.xpath("(//table)[1]//tbody/tr")).size();
			for(int r=1;r<=rowsize;r++) {
				String row = Integer.toString(r);
				if(driver.findElement(By.xpath("(//table)[1]//tbody/tr["+row+"]/td[4]")).getText().contains("Pending"))
				{
					customer.add(driver.findElement(By.xpath("(//table)[1]//tbody/tr["+row+"]/td[3]")).getText());
					status.add(driver.findElement(By.xpath("(//table)[1]//tbody/tr["+row+"]/td[4]")).getText());
				}
			}


			driver.findElement(By.xpath("//ul[@class='pagination']//a[text()='"+next+"']")).click();
		}

		for(String s : customer)
		{
			System.out.println(s);
		}
	}
}
